/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeDateHeure;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeApercuDestinatairePlanOuOrdre;
import mpia.schema.TypeDictionaryDicoApercuDestinatairePlanOuOrdreCategorie;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Apercu Destinataire Plan Ou Ordre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeApercuDestinatairePlanOuOrdreImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeApercuDestinatairePlanOuOrdreImpl#getDate <em>Date</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeApercuDestinatairePlanOuOrdreImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeApercuDestinatairePlanOuOrdreImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeApercuDestinatairePlanOuOrdreImpl extends EObjectImpl implements TypeApercuDestinatairePlanOuOrdre {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoApercuDestinatairePlanOuOrdreCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoApercuDestinatairePlanOuOrdreCategorie.ACK;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoApercuDestinatairePlanOuOrdreCategorie categorie = CATEGORIE_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeApercuDestinatairePlanOuOrdreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeApercuDestinatairePlanOuOrdre();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoApercuDestinatairePlanOuOrdreCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoApercuDestinatairePlanOuOrdreCategorie newCategorie) {
		TypeDictionaryDicoApercuDestinatairePlanOuOrdreCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_APERCU_DESTINATAIRE_PLAN_OU_ORDRE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoApercuDestinatairePlanOuOrdreCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_APERCU_DESTINATAIRE_PLAN_OU_ORDRE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_APERCU_DESTINATAIRE_PLAN_OU_ORDRE__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_APERCU_DESTINATAIRE_PLAN_OU_ORDRE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_APERCU_DESTINATAIRE_PLAN_OU_ORDRE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_APERCU_DESTINATAIRE_PLAN_OU_ORDRE__DATE, newDate, newDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_APERCU_DESTINATAIRE_PLAN_OU_ORDRE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_APERCU_DESTINATAIRE_PLAN_OU_ORDRE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_APERCU_DESTINATAIRE_PLAN_OU_ORDRE__DATE:
				return basicSetDate(null, msgs);
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
			case SchemaPackage.TYPE_APERCU_DESTINATAIRE_PLAN_OU_ORDRE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_APERCU_DESTINATAIRE_PLAN_OU_ORDRE__DATE:
				return getDate();
			case SchemaPackage.TYPE_APERCU_DESTINATAIRE_PLAN_OU_ORDRE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_APERCU_DESTINATAIRE_PLAN_OU_ORDRE__CE:
				return getCE();
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
			case SchemaPackage.TYPE_APERCU_DESTINATAIRE_PLAN_OU_ORDRE__CATEGORIE:
				setCategorie((TypeDictionaryDicoApercuDestinatairePlanOuOrdreCategorie)newValue);
				return;
			case SchemaPackage.TYPE_APERCU_DESTINATAIRE_PLAN_OU_ORDRE__DATE:
				setDate((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_APERCU_DESTINATAIRE_PLAN_OU_ORDRE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_APERCU_DESTINATAIRE_PLAN_OU_ORDRE__CE:
				setCE((String)newValue);
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
			case SchemaPackage.TYPE_APERCU_DESTINATAIRE_PLAN_OU_ORDRE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_APERCU_DESTINATAIRE_PLAN_OU_ORDRE__DATE:
				setDate((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_APERCU_DESTINATAIRE_PLAN_OU_ORDRE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_APERCU_DESTINATAIRE_PLAN_OU_ORDRE__CE:
				setCE(CE_EDEFAULT);
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
			case SchemaPackage.TYPE_APERCU_DESTINATAIRE_PLAN_OU_ORDRE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_APERCU_DESTINATAIRE_PLAN_OU_ORDRE__DATE:
				return date != null;
			case SchemaPackage.TYPE_APERCU_DESTINATAIRE_PLAN_OU_ORDRE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_APERCU_DESTINATAIRE_PLAN_OU_ORDRE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
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

} //TypeApercuDestinatairePlanOuOrdreImpl
