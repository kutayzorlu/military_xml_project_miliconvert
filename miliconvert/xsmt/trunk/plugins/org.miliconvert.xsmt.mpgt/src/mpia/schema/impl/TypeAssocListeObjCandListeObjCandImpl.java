/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssocListeObjCandListeObjCand;
import mpia.schema.TypeDictionaryDicoAssocListeObjCandListeObjCandCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Assoc Liste Obj Cand Liste Obj Cand</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssocListeObjCandListeObjCandImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocListeObjCandListeObjCandImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocListeObjCandListeObjCandImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocListeObjCandListeObjCandImpl#getAPourListeObjectifsObjetListeObjectifsCandidats <em>APour Liste Objectifs Objet Liste Objectifs Candidats</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssocListeObjCandListeObjCandImpl#getAPourListeObjectifsSujetListeObjectifsCandidats <em>APour Liste Objectifs Sujet Liste Objectifs Candidats</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssocListeObjCandListeObjCandImpl extends EObjectImpl implements TypeAssocListeObjCandListeObjCand {
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
	protected static final TypeDictionaryDicoAssocListeObjCandListeObjCandCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoAssocListeObjCandListeObjCandCategorie.COMPNT;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAssocListeObjCandListeObjCandCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The cached value of the '{@link #getAPourListeObjectifsObjetListeObjectifsCandidats() <em>APour Liste Objectifs Objet Liste Objectifs Candidats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourListeObjectifsObjetListeObjectifsCandidats()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourListeObjectifsObjetListeObjectifsCandidats;

	/**
	 * The cached value of the '{@link #getAPourListeObjectifsSujetListeObjectifsCandidats() <em>APour Liste Objectifs Sujet Liste Objectifs Candidats</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourListeObjectifsSujetListeObjectifsCandidats()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourListeObjectifsSujetListeObjectifsCandidats;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssocListeObjCandListeObjCandImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssocListeObjCandListeObjCand();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAssocListeObjCandListeObjCandCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoAssocListeObjCandListeObjCandCategorie newCategorie) {
		TypeDictionaryDicoAssocListeObjCandListeObjCandCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoAssocListeObjCandListeObjCandCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeAssociation getAPourListeObjectifsObjetListeObjectifsCandidats() {
		return aPourListeObjectifsObjetListeObjectifsCandidats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourListeObjectifsObjetListeObjectifsCandidats(TypeAssociation newAPourListeObjectifsObjetListeObjectifsCandidats, NotificationChain msgs) {
		TypeAssociation oldAPourListeObjectifsObjetListeObjectifsCandidats = aPourListeObjectifsObjetListeObjectifsCandidats;
		aPourListeObjectifsObjetListeObjectifsCandidats = newAPourListeObjectifsObjetListeObjectifsCandidats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__APOUR_LISTE_OBJECTIFS_OBJET_LISTE_OBJECTIFS_CANDIDATS, oldAPourListeObjectifsObjetListeObjectifsCandidats, newAPourListeObjectifsObjetListeObjectifsCandidats);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourListeObjectifsObjetListeObjectifsCandidats(TypeAssociation newAPourListeObjectifsObjetListeObjectifsCandidats) {
		if (newAPourListeObjectifsObjetListeObjectifsCandidats != aPourListeObjectifsObjetListeObjectifsCandidats) {
			NotificationChain msgs = null;
			if (aPourListeObjectifsObjetListeObjectifsCandidats != null)
				msgs = ((InternalEObject)aPourListeObjectifsObjetListeObjectifsCandidats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__APOUR_LISTE_OBJECTIFS_OBJET_LISTE_OBJECTIFS_CANDIDATS, null, msgs);
			if (newAPourListeObjectifsObjetListeObjectifsCandidats != null)
				msgs = ((InternalEObject)newAPourListeObjectifsObjetListeObjectifsCandidats).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__APOUR_LISTE_OBJECTIFS_OBJET_LISTE_OBJECTIFS_CANDIDATS, null, msgs);
			msgs = basicSetAPourListeObjectifsObjetListeObjectifsCandidats(newAPourListeObjectifsObjetListeObjectifsCandidats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__APOUR_LISTE_OBJECTIFS_OBJET_LISTE_OBJECTIFS_CANDIDATS, newAPourListeObjectifsObjetListeObjectifsCandidats, newAPourListeObjectifsObjetListeObjectifsCandidats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourListeObjectifsSujetListeObjectifsCandidats() {
		return aPourListeObjectifsSujetListeObjectifsCandidats;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourListeObjectifsSujetListeObjectifsCandidats(TypeAssociation newAPourListeObjectifsSujetListeObjectifsCandidats, NotificationChain msgs) {
		TypeAssociation oldAPourListeObjectifsSujetListeObjectifsCandidats = aPourListeObjectifsSujetListeObjectifsCandidats;
		aPourListeObjectifsSujetListeObjectifsCandidats = newAPourListeObjectifsSujetListeObjectifsCandidats;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__APOUR_LISTE_OBJECTIFS_SUJET_LISTE_OBJECTIFS_CANDIDATS, oldAPourListeObjectifsSujetListeObjectifsCandidats, newAPourListeObjectifsSujetListeObjectifsCandidats);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourListeObjectifsSujetListeObjectifsCandidats(TypeAssociation newAPourListeObjectifsSujetListeObjectifsCandidats) {
		if (newAPourListeObjectifsSujetListeObjectifsCandidats != aPourListeObjectifsSujetListeObjectifsCandidats) {
			NotificationChain msgs = null;
			if (aPourListeObjectifsSujetListeObjectifsCandidats != null)
				msgs = ((InternalEObject)aPourListeObjectifsSujetListeObjectifsCandidats).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__APOUR_LISTE_OBJECTIFS_SUJET_LISTE_OBJECTIFS_CANDIDATS, null, msgs);
			if (newAPourListeObjectifsSujetListeObjectifsCandidats != null)
				msgs = ((InternalEObject)newAPourListeObjectifsSujetListeObjectifsCandidats).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__APOUR_LISTE_OBJECTIFS_SUJET_LISTE_OBJECTIFS_CANDIDATS, null, msgs);
			msgs = basicSetAPourListeObjectifsSujetListeObjectifsCandidats(newAPourListeObjectifsSujetListeObjectifsCandidats, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__APOUR_LISTE_OBJECTIFS_SUJET_LISTE_OBJECTIFS_CANDIDATS, newAPourListeObjectifsSujetListeObjectifsCandidats, newAPourListeObjectifsSujetListeObjectifsCandidats));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__APOUR_LISTE_OBJECTIFS_OBJET_LISTE_OBJECTIFS_CANDIDATS:
				return basicSetAPourListeObjectifsObjetListeObjectifsCandidats(null, msgs);
			case SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__APOUR_LISTE_OBJECTIFS_SUJET_LISTE_OBJECTIFS_CANDIDATS:
				return basicSetAPourListeObjectifsSujetListeObjectifsCandidats(null, msgs);
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
			case SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__APOUR_LISTE_OBJECTIFS_OBJET_LISTE_OBJECTIFS_CANDIDATS:
				return getAPourListeObjectifsObjetListeObjectifsCandidats();
			case SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__APOUR_LISTE_OBJECTIFS_SUJET_LISTE_OBJECTIFS_CANDIDATS:
				return getAPourListeObjectifsSujetListeObjectifsCandidats();
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
			case SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__CATEGORIE:
				setCategorie((TypeDictionaryDicoAssocListeObjCandListeObjCandCategorie)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__APOUR_LISTE_OBJECTIFS_OBJET_LISTE_OBJECTIFS_CANDIDATS:
				setAPourListeObjectifsObjetListeObjectifsCandidats((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__APOUR_LISTE_OBJECTIFS_SUJET_LISTE_OBJECTIFS_CANDIDATS:
				setAPourListeObjectifsSujetListeObjectifsCandidats((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__APOUR_LISTE_OBJECTIFS_OBJET_LISTE_OBJECTIFS_CANDIDATS:
				setAPourListeObjectifsObjetListeObjectifsCandidats((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__APOUR_LISTE_OBJECTIFS_SUJET_LISTE_OBJECTIFS_CANDIDATS:
				setAPourListeObjectifsSujetListeObjectifsCandidats((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__APOUR_LISTE_OBJECTIFS_OBJET_LISTE_OBJECTIFS_CANDIDATS:
				return aPourListeObjectifsObjetListeObjectifsCandidats != null;
			case SchemaPackage.TYPE_ASSOC_LISTE_OBJ_CAND_LISTE_OBJ_CAND__APOUR_LISTE_OBJECTIFS_SUJET_LISTE_OBJECTIFS_CANDIDATS:
				return aPourListeObjectifsSujetListeObjectifsCandidats != null;
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

} //TypeAssocListeObjCandListeObjCandImpl
