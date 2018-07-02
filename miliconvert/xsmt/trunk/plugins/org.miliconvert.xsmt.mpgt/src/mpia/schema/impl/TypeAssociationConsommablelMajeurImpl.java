/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAssociationConsommablelMajeur;
import mpia.schema.TypeQuantiteMaintenir;

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
 * An implementation of the model object '<em><b>Type Association Consommablel Majeur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationConsommablelMajeurImpl#isSuiviLogistique <em>Suivi Logistique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationConsommablelMajeurImpl#isSuiviTactique <em>Suivi Tactique</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationConsommablelMajeurImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationConsommablelMajeurImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationConsommablelMajeurImpl#getAssocieCommeUniteUnite <em>Associe Comme Unite Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationConsommablelMajeurImpl#getAPourQuantiteAMaintenirQuantiteMaintenir <em>APour Quantite AMaintenir Quantite Maintenir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationConsommablelMajeurImpl#getAssocieCommeTypeConsommableTypeConsommable <em>Associe Comme Type Consommable Type Consommable</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationConsommablelMajeurImpl extends EObjectImpl implements TypeAssociationConsommablelMajeur {
	/**
	 * The default value of the '{@link #isSuiviLogistique() <em>Suivi Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuiviLogistique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUIVI_LOGISTIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSuiviLogistique() <em>Suivi Logistique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuiviLogistique()
	 * @generated
	 * @ordered
	 */
	protected boolean suiviLogistique = SUIVI_LOGISTIQUE_EDEFAULT;

	/**
	 * This is true if the Suivi Logistique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean suiviLogistiqueESet;

	/**
	 * The default value of the '{@link #isSuiviTactique() <em>Suivi Tactique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuiviTactique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SUIVI_TACTIQUE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSuiviTactique() <em>Suivi Tactique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSuiviTactique()
	 * @generated
	 * @ordered
	 */
	protected boolean suiviTactique = SUIVI_TACTIQUE_EDEFAULT;

	/**
	 * This is true if the Suivi Tactique attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean suiviTactiqueESet;

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
	 * The cached value of the '{@link #getAssocieCommeUniteUnite() <em>Associe Comme Unite Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeUniteUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT associeCommeUniteUnite;

	/**
	 * The cached value of the '{@link #getAPourQuantiteAMaintenirQuantiteMaintenir() <em>APour Quantite AMaintenir Quantite Maintenir</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourQuantiteAMaintenirQuantiteMaintenir()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeQuantiteMaintenir> aPourQuantiteAMaintenirQuantiteMaintenir;

	/**
	 * The cached value of the '{@link #getAssocieCommeTypeConsommableTypeConsommable() <em>Associe Comme Type Consommable Type Consommable</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssocieCommeTypeConsommableTypeConsommable()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation associeCommeTypeConsommableTypeConsommable;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationConsommablelMajeurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationConsommablelMajeur();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSuiviLogistique() {
		return suiviLogistique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuiviLogistique(boolean newSuiviLogistique) {
		boolean oldSuiviLogistique = suiviLogistique;
		suiviLogistique = newSuiviLogistique;
		boolean oldSuiviLogistiqueESet = suiviLogistiqueESet;
		suiviLogistiqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__SUIVI_LOGISTIQUE, oldSuiviLogistique, suiviLogistique, !oldSuiviLogistiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSuiviLogistique() {
		boolean oldSuiviLogistique = suiviLogistique;
		boolean oldSuiviLogistiqueESet = suiviLogistiqueESet;
		suiviLogistique = SUIVI_LOGISTIQUE_EDEFAULT;
		suiviLogistiqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__SUIVI_LOGISTIQUE, oldSuiviLogistique, SUIVI_LOGISTIQUE_EDEFAULT, oldSuiviLogistiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSuiviLogistique() {
		return suiviLogistiqueESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSuiviTactique() {
		return suiviTactique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuiviTactique(boolean newSuiviTactique) {
		boolean oldSuiviTactique = suiviTactique;
		suiviTactique = newSuiviTactique;
		boolean oldSuiviTactiqueESet = suiviTactiqueESet;
		suiviTactiqueESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__SUIVI_TACTIQUE, oldSuiviTactique, suiviTactique, !oldSuiviTactiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSuiviTactique() {
		boolean oldSuiviTactique = suiviTactique;
		boolean oldSuiviTactiqueESet = suiviTactiqueESet;
		suiviTactique = SUIVI_TACTIQUE_EDEFAULT;
		suiviTactiqueESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__SUIVI_TACTIQUE, oldSuiviTactique, SUIVI_TACTIQUE_EDEFAULT, oldSuiviTactiqueESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSuiviTactique() {
		return suiviTactiqueESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAssocieCommeUniteUnite() {
		return associeCommeUniteUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeUniteUnite(TypeAssociationEXT newAssocieCommeUniteUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAssocieCommeUniteUnite = associeCommeUniteUnite;
		associeCommeUniteUnite = newAssocieCommeUniteUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__ASSOCIE_COMME_UNITE_UNITE, oldAssocieCommeUniteUnite, newAssocieCommeUniteUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeUniteUnite(TypeAssociationEXT newAssocieCommeUniteUnite) {
		if (newAssocieCommeUniteUnite != associeCommeUniteUnite) {
			NotificationChain msgs = null;
			if (associeCommeUniteUnite != null)
				msgs = ((InternalEObject)associeCommeUniteUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__ASSOCIE_COMME_UNITE_UNITE, null, msgs);
			if (newAssocieCommeUniteUnite != null)
				msgs = ((InternalEObject)newAssocieCommeUniteUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__ASSOCIE_COMME_UNITE_UNITE, null, msgs);
			msgs = basicSetAssocieCommeUniteUnite(newAssocieCommeUniteUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__ASSOCIE_COMME_UNITE_UNITE, newAssocieCommeUniteUnite, newAssocieCommeUniteUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeQuantiteMaintenir> getAPourQuantiteAMaintenirQuantiteMaintenir() {
		if (aPourQuantiteAMaintenirQuantiteMaintenir == null) {
			aPourQuantiteAMaintenirQuantiteMaintenir = new EObjectContainmentEList<TypeQuantiteMaintenir>(TypeQuantiteMaintenir.class, this, SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__APOUR_QUANTITE_AMAINTENIR_QUANTITE_MAINTENIR);
		}
		return aPourQuantiteAMaintenirQuantiteMaintenir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAssocieCommeTypeConsommableTypeConsommable() {
		return associeCommeTypeConsommableTypeConsommable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssocieCommeTypeConsommableTypeConsommable(TypeAssociation newAssocieCommeTypeConsommableTypeConsommable, NotificationChain msgs) {
		TypeAssociation oldAssocieCommeTypeConsommableTypeConsommable = associeCommeTypeConsommableTypeConsommable;
		associeCommeTypeConsommableTypeConsommable = newAssocieCommeTypeConsommableTypeConsommable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__ASSOCIE_COMME_TYPE_CONSOMMABLE_TYPE_CONSOMMABLE, oldAssocieCommeTypeConsommableTypeConsommable, newAssocieCommeTypeConsommableTypeConsommable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssocieCommeTypeConsommableTypeConsommable(TypeAssociation newAssocieCommeTypeConsommableTypeConsommable) {
		if (newAssocieCommeTypeConsommableTypeConsommable != associeCommeTypeConsommableTypeConsommable) {
			NotificationChain msgs = null;
			if (associeCommeTypeConsommableTypeConsommable != null)
				msgs = ((InternalEObject)associeCommeTypeConsommableTypeConsommable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__ASSOCIE_COMME_TYPE_CONSOMMABLE_TYPE_CONSOMMABLE, null, msgs);
			if (newAssocieCommeTypeConsommableTypeConsommable != null)
				msgs = ((InternalEObject)newAssocieCommeTypeConsommableTypeConsommable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__ASSOCIE_COMME_TYPE_CONSOMMABLE_TYPE_CONSOMMABLE, null, msgs);
			msgs = basicSetAssocieCommeTypeConsommableTypeConsommable(newAssocieCommeTypeConsommableTypeConsommable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__ASSOCIE_COMME_TYPE_CONSOMMABLE_TYPE_CONSOMMABLE, newAssocieCommeTypeConsommableTypeConsommable, newAssocieCommeTypeConsommableTypeConsommable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__ASSOCIE_COMME_UNITE_UNITE:
				return basicSetAssocieCommeUniteUnite(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__APOUR_QUANTITE_AMAINTENIR_QUANTITE_MAINTENIR:
				return ((InternalEList<?>)getAPourQuantiteAMaintenirQuantiteMaintenir()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__ASSOCIE_COMME_TYPE_CONSOMMABLE_TYPE_CONSOMMABLE:
				return basicSetAssocieCommeTypeConsommableTypeConsommable(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__SUIVI_LOGISTIQUE:
				return isSuiviLogistique() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__SUIVI_TACTIQUE:
				return isSuiviTactique() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__ASSOCIE_COMME_UNITE_UNITE:
				return getAssocieCommeUniteUnite();
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__APOUR_QUANTITE_AMAINTENIR_QUANTITE_MAINTENIR:
				return getAPourQuantiteAMaintenirQuantiteMaintenir();
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__ASSOCIE_COMME_TYPE_CONSOMMABLE_TYPE_CONSOMMABLE:
				return getAssocieCommeTypeConsommableTypeConsommable();
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
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__SUIVI_LOGISTIQUE:
				setSuiviLogistique(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__SUIVI_TACTIQUE:
				setSuiviTactique(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__ASSOCIE_COMME_UNITE_UNITE:
				setAssocieCommeUniteUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__APOUR_QUANTITE_AMAINTENIR_QUANTITE_MAINTENIR:
				getAPourQuantiteAMaintenirQuantiteMaintenir().clear();
				getAPourQuantiteAMaintenirQuantiteMaintenir().addAll((Collection<? extends TypeQuantiteMaintenir>)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__ASSOCIE_COMME_TYPE_CONSOMMABLE_TYPE_CONSOMMABLE:
				setAssocieCommeTypeConsommableTypeConsommable((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__SUIVI_LOGISTIQUE:
				unsetSuiviLogistique();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__SUIVI_TACTIQUE:
				unsetSuiviTactique();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__ASSOCIE_COMME_UNITE_UNITE:
				setAssocieCommeUniteUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__APOUR_QUANTITE_AMAINTENIR_QUANTITE_MAINTENIR:
				getAPourQuantiteAMaintenirQuantiteMaintenir().clear();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__ASSOCIE_COMME_TYPE_CONSOMMABLE_TYPE_CONSOMMABLE:
				setAssocieCommeTypeConsommableTypeConsommable((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__SUIVI_LOGISTIQUE:
				return isSetSuiviLogistique();
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__SUIVI_TACTIQUE:
				return isSetSuiviTactique();
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__ASSOCIE_COMME_UNITE_UNITE:
				return associeCommeUniteUnite != null;
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__APOUR_QUANTITE_AMAINTENIR_QUANTITE_MAINTENIR:
				return aPourQuantiteAMaintenirQuantiteMaintenir != null && !aPourQuantiteAMaintenirQuantiteMaintenir.isEmpty();
			case SchemaPackage.TYPE_ASSOCIATION_CONSOMMABLEL_MAJEUR__ASSOCIE_COMME_TYPE_CONSOMMABLE_TYPE_CONSOMMABLE:
				return associeCommeTypeConsommableTypeConsommable != null;
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
		result.append(" (suiviLogistique: ");
		if (suiviLogistiqueESet) result.append(suiviLogistique); else result.append("<unset>");
		result.append(", suiviTactique: ");
		if (suiviTactiqueESet) result.append(suiviTactique); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeAssociationConsommablelMajeurImpl
