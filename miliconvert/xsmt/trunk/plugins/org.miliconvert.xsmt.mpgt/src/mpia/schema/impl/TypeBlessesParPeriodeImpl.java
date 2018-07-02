/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeBlessesParPeriode;
import mpia.schema.TypeDictionaryDicoBlessesParPeriodeCategorie;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Blesses Par Periode</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeBlessesParPeriodeImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBlessesParPeriodeImpl#getQuantiteArrives <em>Quantite Arrives</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBlessesParPeriodeImpl#getQuantiteAdmis <em>Quantite Admis</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBlessesParPeriodeImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBlessesParPeriodeImpl#getCE <em>CE</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeBlessesParPeriodeImpl extends EObjectImpl implements TypeBlessesParPeriode {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoBlessesParPeriodeCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoBlessesParPeriodeCategorie.NONBAT;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoBlessesParPeriodeCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getQuantiteArrives() <em>Quantite Arrives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteArrives()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_ARRIVES_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteArrives() <em>Quantite Arrives</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteArrives()
	 * @generated
	 * @ordered
	 */
	protected long quantiteArrives = QUANTITE_ARRIVES_EDEFAULT;

	/**
	 * This is true if the Quantite Arrives attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteArrivesESet;

	/**
	 * The default value of the '{@link #getQuantiteAdmis() <em>Quantite Admis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteAdmis()
	 * @generated
	 * @ordered
	 */
	protected static final long QUANTITE_ADMIS_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getQuantiteAdmis() <em>Quantite Admis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantiteAdmis()
	 * @generated
	 * @ordered
	 */
	protected long quantiteAdmis = QUANTITE_ADMIS_EDEFAULT;

	/**
	 * This is true if the Quantite Admis attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean quantiteAdmisESet;

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
	protected TypeBlessesParPeriodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeBlessesParPeriode();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoBlessesParPeriodeCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoBlessesParPeriodeCategorie newCategorie) {
		TypeDictionaryDicoBlessesParPeriodeCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BLESSES_PAR_PERIODE__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoBlessesParPeriodeCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_BLESSES_PAR_PERIODE__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public long getQuantiteArrives() {
		return quantiteArrives;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteArrives(long newQuantiteArrives) {
		long oldQuantiteArrives = quantiteArrives;
		quantiteArrives = newQuantiteArrives;
		boolean oldQuantiteArrivesESet = quantiteArrivesESet;
		quantiteArrivesESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BLESSES_PAR_PERIODE__QUANTITE_ARRIVES, oldQuantiteArrives, quantiteArrives, !oldQuantiteArrivesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteArrives() {
		long oldQuantiteArrives = quantiteArrives;
		boolean oldQuantiteArrivesESet = quantiteArrivesESet;
		quantiteArrives = QUANTITE_ARRIVES_EDEFAULT;
		quantiteArrivesESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_BLESSES_PAR_PERIODE__QUANTITE_ARRIVES, oldQuantiteArrives, QUANTITE_ARRIVES_EDEFAULT, oldQuantiteArrivesESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteArrives() {
		return quantiteArrivesESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getQuantiteAdmis() {
		return quantiteAdmis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQuantiteAdmis(long newQuantiteAdmis) {
		long oldQuantiteAdmis = quantiteAdmis;
		quantiteAdmis = newQuantiteAdmis;
		boolean oldQuantiteAdmisESet = quantiteAdmisESet;
		quantiteAdmisESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BLESSES_PAR_PERIODE__QUANTITE_ADMIS, oldQuantiteAdmis, quantiteAdmis, !oldQuantiteAdmisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetQuantiteAdmis() {
		long oldQuantiteAdmis = quantiteAdmis;
		boolean oldQuantiteAdmisESet = quantiteAdmisESet;
		quantiteAdmis = QUANTITE_ADMIS_EDEFAULT;
		quantiteAdmisESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_BLESSES_PAR_PERIODE__QUANTITE_ADMIS, oldQuantiteAdmis, QUANTITE_ADMIS_EDEFAULT, oldQuantiteAdmisESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetQuantiteAdmis() {
		return quantiteAdmisESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BLESSES_PAR_PERIODE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BLESSES_PAR_PERIODE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_BLESSES_PAR_PERIODE__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_BLESSES_PAR_PERIODE__QUANTITE_ARRIVES:
				return new Long(getQuantiteArrives());
			case SchemaPackage.TYPE_BLESSES_PAR_PERIODE__QUANTITE_ADMIS:
				return new Long(getQuantiteAdmis());
			case SchemaPackage.TYPE_BLESSES_PAR_PERIODE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_BLESSES_PAR_PERIODE__CE:
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
			case SchemaPackage.TYPE_BLESSES_PAR_PERIODE__CATEGORIE:
				setCategorie((TypeDictionaryDicoBlessesParPeriodeCategorie)newValue);
				return;
			case SchemaPackage.TYPE_BLESSES_PAR_PERIODE__QUANTITE_ARRIVES:
				setQuantiteArrives(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_BLESSES_PAR_PERIODE__QUANTITE_ADMIS:
				setQuantiteAdmis(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_BLESSES_PAR_PERIODE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_BLESSES_PAR_PERIODE__CE:
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
			case SchemaPackage.TYPE_BLESSES_PAR_PERIODE__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_BLESSES_PAR_PERIODE__QUANTITE_ARRIVES:
				unsetQuantiteArrives();
				return;
			case SchemaPackage.TYPE_BLESSES_PAR_PERIODE__QUANTITE_ADMIS:
				unsetQuantiteAdmis();
				return;
			case SchemaPackage.TYPE_BLESSES_PAR_PERIODE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_BLESSES_PAR_PERIODE__CE:
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
			case SchemaPackage.TYPE_BLESSES_PAR_PERIODE__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_BLESSES_PAR_PERIODE__QUANTITE_ARRIVES:
				return isSetQuantiteArrives();
			case SchemaPackage.TYPE_BLESSES_PAR_PERIODE__QUANTITE_ADMIS:
				return isSetQuantiteAdmis();
			case SchemaPackage.TYPE_BLESSES_PAR_PERIODE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_BLESSES_PAR_PERIODE__CE:
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
		result.append(", quantiteArrives: ");
		if (quantiteArrivesESet) result.append(quantiteArrives); else result.append("<unset>");
		result.append(", quantiteAdmis: ");
		if (quantiteAdmisESet) result.append(quantiteAdmis); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeBlessesParPeriodeImpl
