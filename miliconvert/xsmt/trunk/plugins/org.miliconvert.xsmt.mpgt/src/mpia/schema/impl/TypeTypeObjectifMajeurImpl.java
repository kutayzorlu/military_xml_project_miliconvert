/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoPrioriteTir;
import mpia.schema.TypeDictionaryDicoTypeObjectifMajeurCategorie;
import mpia.schema.TypeEffetAuContactASS;
import mpia.schema.TypeElementVital;
import mpia.schema.TypeTypeObjectifMajeur;

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
 * An implementation of the model object '<em><b>Type Type Objectif Majeur</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeTypeObjectifMajeurImpl#getCategorie <em>Categorie</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeObjectifMajeurImpl#getPriorite <em>Priorite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeObjectifMajeurImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeObjectifMajeurImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeObjectifMajeurImpl#getAPourEffetMajeurARealiserEffetAuContactASS <em>APour Effet Majeur ARealiser Effet Au Contact ASS</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeTypeObjectifMajeurImpl#getAPourElementsVitauxElementVital <em>APour Elements Vitaux Element Vital</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeTypeObjectifMajeurImpl extends EObjectImpl implements TypeTypeObjectifMajeur {
	/**
	 * The default value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeObjectifMajeurCategorie CATEGORIE_EDEFAULT = TypeDictionaryDicoTypeObjectifMajeurCategorie.MECARM;

	/**
	 * The cached value of the '{@link #getCategorie() <em>Categorie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategorie()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeObjectifMajeurCategorie categorie = CATEGORIE_EDEFAULT;

	/**
	 * This is true if the Categorie attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean categorieESet;

	/**
	 * The default value of the '{@link #getPriorite() <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPrioriteTir PRIORITE_EDEFAULT = TypeDictionaryDicoPrioriteTir.IMM;

	/**
	 * The cached value of the '{@link #getPriorite() <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPrioriteTir priorite = PRIORITE_EDEFAULT;

	/**
	 * This is true if the Priorite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean prioriteESet;

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
	 * The cached value of the '{@link #getAPourEffetMajeurARealiserEffetAuContactASS() <em>APour Effet Majeur ARealiser Effet Au Contact ASS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEffetMajeurARealiserEffetAuContactASS()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEffetAuContactASS> aPourEffetMajeurARealiserEffetAuContactASS;

	/**
	 * The cached value of the '{@link #getAPourElementsVitauxElementVital() <em>APour Elements Vitaux Element Vital</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourElementsVitauxElementVital()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeElementVital> aPourElementsVitauxElementVital;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeTypeObjectifMajeurImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeTypeObjectifMajeur();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeObjectifMajeurCategorie getCategorie() {
		return categorie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategorie(TypeDictionaryDicoTypeObjectifMajeurCategorie newCategorie) {
		TypeDictionaryDicoTypeObjectifMajeurCategorie oldCategorie = categorie;
		categorie = newCategorie == null ? CATEGORIE_EDEFAULT : newCategorie;
		boolean oldCategorieESet = categorieESet;
		categorieESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__CATEGORIE, oldCategorie, categorie, !oldCategorieESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCategorie() {
		TypeDictionaryDicoTypeObjectifMajeurCategorie oldCategorie = categorie;
		boolean oldCategorieESet = categorieESet;
		categorie = CATEGORIE_EDEFAULT;
		categorieESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__CATEGORIE, oldCategorie, CATEGORIE_EDEFAULT, oldCategorieESet));
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
	public TypeDictionaryDicoPrioriteTir getPriorite() {
		return priorite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorite(TypeDictionaryDicoPrioriteTir newPriorite) {
		TypeDictionaryDicoPrioriteTir oldPriorite = priorite;
		priorite = newPriorite == null ? PRIORITE_EDEFAULT : newPriorite;
		boolean oldPrioriteESet = prioriteESet;
		prioriteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__PRIORITE, oldPriorite, priorite, !oldPrioriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPriorite() {
		TypeDictionaryDicoPrioriteTir oldPriorite = priorite;
		boolean oldPrioriteESet = prioriteESet;
		priorite = PRIORITE_EDEFAULT;
		prioriteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__PRIORITE, oldPriorite, PRIORITE_EDEFAULT, oldPrioriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPriorite() {
		return prioriteESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEffetAuContactASS> getAPourEffetMajeurARealiserEffetAuContactASS() {
		if (aPourEffetMajeurARealiserEffetAuContactASS == null) {
			aPourEffetMajeurARealiserEffetAuContactASS = new EObjectContainmentEList<TypeEffetAuContactASS>(TypeEffetAuContactASS.class, this, SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__APOUR_EFFET_MAJEUR_AREALISER_EFFET_AU_CONTACT_ASS);
		}
		return aPourEffetMajeurARealiserEffetAuContactASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeElementVital> getAPourElementsVitauxElementVital() {
		if (aPourElementsVitauxElementVital == null) {
			aPourElementsVitauxElementVital = new EObjectContainmentEList<TypeElementVital>(TypeElementVital.class, this, SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__APOUR_ELEMENTS_VITAUX_ELEMENT_VITAL);
		}
		return aPourElementsVitauxElementVital;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__APOUR_EFFET_MAJEUR_AREALISER_EFFET_AU_CONTACT_ASS:
				return ((InternalEList<?>)getAPourEffetMajeurARealiserEffetAuContactASS()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__APOUR_ELEMENTS_VITAUX_ELEMENT_VITAL:
				return ((InternalEList<?>)getAPourElementsVitauxElementVital()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__CATEGORIE:
				return getCategorie();
			case SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__PRIORITE:
				return getPriorite();
			case SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__CTE:
				return getCTE();
			case SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__CE:
				return getCE();
			case SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__APOUR_EFFET_MAJEUR_AREALISER_EFFET_AU_CONTACT_ASS:
				return getAPourEffetMajeurARealiserEffetAuContactASS();
			case SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__APOUR_ELEMENTS_VITAUX_ELEMENT_VITAL:
				return getAPourElementsVitauxElementVital();
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
			case SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__CATEGORIE:
				setCategorie((TypeDictionaryDicoTypeObjectifMajeurCategorie)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__PRIORITE:
				setPriorite((TypeDictionaryDicoPrioriteTir)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__APOUR_EFFET_MAJEUR_AREALISER_EFFET_AU_CONTACT_ASS:
				getAPourEffetMajeurARealiserEffetAuContactASS().clear();
				getAPourEffetMajeurARealiserEffetAuContactASS().addAll((Collection<? extends TypeEffetAuContactASS>)newValue);
				return;
			case SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__APOUR_ELEMENTS_VITAUX_ELEMENT_VITAL:
				getAPourElementsVitauxElementVital().clear();
				getAPourElementsVitauxElementVital().addAll((Collection<? extends TypeElementVital>)newValue);
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
			case SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__CATEGORIE:
				unsetCategorie();
				return;
			case SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__PRIORITE:
				unsetPriorite();
				return;
			case SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__APOUR_EFFET_MAJEUR_AREALISER_EFFET_AU_CONTACT_ASS:
				getAPourEffetMajeurARealiserEffetAuContactASS().clear();
				return;
			case SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__APOUR_ELEMENTS_VITAUX_ELEMENT_VITAL:
				getAPourElementsVitauxElementVital().clear();
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
			case SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__CATEGORIE:
				return isSetCategorie();
			case SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__PRIORITE:
				return isSetPriorite();
			case SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__APOUR_EFFET_MAJEUR_AREALISER_EFFET_AU_CONTACT_ASS:
				return aPourEffetMajeurARealiserEffetAuContactASS != null && !aPourEffetMajeurARealiserEffetAuContactASS.isEmpty();
			case SchemaPackage.TYPE_TYPE_OBJECTIF_MAJEUR__APOUR_ELEMENTS_VITAUX_ELEMENT_VITAL:
				return aPourElementsVitauxElementVital != null && !aPourElementsVitauxElementVital.isEmpty();
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
		result.append(", priorite: ");
		if (prioriteESet) result.append(priorite); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeTypeObjectifMajeurImpl
