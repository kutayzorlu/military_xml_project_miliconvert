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
import mpia.schema.TypeCapacite;
import mpia.schema.TypeDictionaryDicoCapaciteConditionLumiere;
import mpia.schema.TypeDictionaryDicoCapaciteUnite;

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
 * An implementation of the model object '<em><b>Type Capacite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCapaciteImpl#getUnite <em>Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteImpl#getConditionLumiere <em>Condition Lumiere</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteImpl#getEstCapaciteAssociationActiviteCapacite <em>Est Capacite Association Activite Capacite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteImpl#getEstPossedeeParTypeAssociationTypeCapacite <em>Est Possedee Par Type Association Type Capacite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCapaciteImpl#getAPourDocumentAssocieAssociationDocumentCapacite <em>APour Document Associe Association Document Capacite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TypeCapaciteImpl extends EObjectImpl implements TypeCapacite {
	/**
	 * The default value of the '{@link #getUnite() <em>Unite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnite()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCapaciteUnite UNITE_EDEFAULT = TypeDictionaryDicoCapaciteUnite.CM;

	/**
	 * The cached value of the '{@link #getUnite() <em>Unite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCapaciteUnite unite = UNITE_EDEFAULT;

	/**
	 * This is true if the Unite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean uniteESet;

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
	 * The default value of the '{@link #getConditionLumiere() <em>Condition Lumiere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionLumiere()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoCapaciteConditionLumiere CONDITION_LUMIERE_EDEFAULT = TypeDictionaryDicoCapaciteConditionLumiere.DAY;

	/**
	 * The cached value of the '{@link #getConditionLumiere() <em>Condition Lumiere</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionLumiere()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoCapaciteConditionLumiere conditionLumiere = CONDITION_LUMIERE_EDEFAULT;

	/**
	 * This is true if the Condition Lumiere attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean conditionLumiereESet;

	/**
	 * The cached value of the '{@link #getEstCapaciteAssociationActiviteCapacite() <em>Est Capacite Association Activite Capacite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstCapaciteAssociationActiviteCapacite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estCapaciteAssociationActiviteCapacite;

	/**
	 * The cached value of the '{@link #getEstPossedeeParTypeAssociationTypeCapacite() <em>Est Possedee Par Type Association Type Capacite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstPossedeeParTypeAssociationTypeCapacite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> estPossedeeParTypeAssociationTypeCapacite;

	/**
	 * The cached value of the '{@link #getAPourDocumentAssocieAssociationDocumentCapacite() <em>APour Document Associe Association Document Capacite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourDocumentAssocieAssociationDocumentCapacite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourDocumentAssocieAssociationDocumentCapacite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCapaciteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCapacite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCapaciteUnite getUnite() {
		return unite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUnite(TypeDictionaryDicoCapaciteUnite newUnite) {
		TypeDictionaryDicoCapaciteUnite oldUnite = unite;
		unite = newUnite == null ? UNITE_EDEFAULT : newUnite;
		boolean oldUniteESet = uniteESet;
		uniteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE__UNITE, oldUnite, unite, !oldUniteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetUnite() {
		TypeDictionaryDicoCapaciteUnite oldUnite = unite;
		boolean oldUniteESet = uniteESet;
		unite = UNITE_EDEFAULT;
		uniteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE__UNITE, oldUnite, UNITE_EDEFAULT, oldUniteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetUnite() {
		return uniteESet;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoCapaciteConditionLumiere getConditionLumiere() {
		return conditionLumiere;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionLumiere(TypeDictionaryDicoCapaciteConditionLumiere newConditionLumiere) {
		TypeDictionaryDicoCapaciteConditionLumiere oldConditionLumiere = conditionLumiere;
		conditionLumiere = newConditionLumiere == null ? CONDITION_LUMIERE_EDEFAULT : newConditionLumiere;
		boolean oldConditionLumiereESet = conditionLumiereESet;
		conditionLumiereESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CAPACITE__CONDITION_LUMIERE, oldConditionLumiere, conditionLumiere, !oldConditionLumiereESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetConditionLumiere() {
		TypeDictionaryDicoCapaciteConditionLumiere oldConditionLumiere = conditionLumiere;
		boolean oldConditionLumiereESet = conditionLumiereESet;
		conditionLumiere = CONDITION_LUMIERE_EDEFAULT;
		conditionLumiereESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CAPACITE__CONDITION_LUMIERE, oldConditionLumiere, CONDITION_LUMIERE_EDEFAULT, oldConditionLumiereESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConditionLumiere() {
		return conditionLumiereESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstCapaciteAssociationActiviteCapacite() {
		if (estCapaciteAssociationActiviteCapacite == null) {
			estCapaciteAssociationActiviteCapacite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CAPACITE__EST_CAPACITE_ASSOCIATION_ACTIVITE_CAPACITE);
		}
		return estCapaciteAssociationActiviteCapacite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getEstPossedeeParTypeAssociationTypeCapacite() {
		if (estPossedeeParTypeAssociationTypeCapacite == null) {
			estPossedeeParTypeAssociationTypeCapacite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CAPACITE__EST_POSSEDEE_PAR_TYPE_ASSOCIATION_TYPE_CAPACITE);
		}
		return estPossedeeParTypeAssociationTypeCapacite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourDocumentAssocieAssociationDocumentCapacite() {
		if (aPourDocumentAssocieAssociationDocumentCapacite == null) {
			aPourDocumentAssocieAssociationDocumentCapacite = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CAPACITE__APOUR_DOCUMENT_ASSOCIE_ASSOCIATION_DOCUMENT_CAPACITE);
		}
		return aPourDocumentAssocieAssociationDocumentCapacite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CAPACITE__EST_CAPACITE_ASSOCIATION_ACTIVITE_CAPACITE:
				return ((InternalEList<?>)getEstCapaciteAssociationActiviteCapacite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CAPACITE__EST_POSSEDEE_PAR_TYPE_ASSOCIATION_TYPE_CAPACITE:
				return ((InternalEList<?>)getEstPossedeeParTypeAssociationTypeCapacite()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CAPACITE__APOUR_DOCUMENT_ASSOCIE_ASSOCIATION_DOCUMENT_CAPACITE:
				return ((InternalEList<?>)getAPourDocumentAssocieAssociationDocumentCapacite()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_CAPACITE__UNITE:
				return getUnite();
			case SchemaPackage.TYPE_CAPACITE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_CAPACITE__CE:
				return getCE();
			case SchemaPackage.TYPE_CAPACITE__CONDITION_LUMIERE:
				return getConditionLumiere();
			case SchemaPackage.TYPE_CAPACITE__EST_CAPACITE_ASSOCIATION_ACTIVITE_CAPACITE:
				return getEstCapaciteAssociationActiviteCapacite();
			case SchemaPackage.TYPE_CAPACITE__EST_POSSEDEE_PAR_TYPE_ASSOCIATION_TYPE_CAPACITE:
				return getEstPossedeeParTypeAssociationTypeCapacite();
			case SchemaPackage.TYPE_CAPACITE__APOUR_DOCUMENT_ASSOCIE_ASSOCIATION_DOCUMENT_CAPACITE:
				return getAPourDocumentAssocieAssociationDocumentCapacite();
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
			case SchemaPackage.TYPE_CAPACITE__UNITE:
				setUnite((TypeDictionaryDicoCapaciteUnite)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE__CONDITION_LUMIERE:
				setConditionLumiere((TypeDictionaryDicoCapaciteConditionLumiere)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE__EST_CAPACITE_ASSOCIATION_ACTIVITE_CAPACITE:
				getEstCapaciteAssociationActiviteCapacite().clear();
				getEstCapaciteAssociationActiviteCapacite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE__EST_POSSEDEE_PAR_TYPE_ASSOCIATION_TYPE_CAPACITE:
				getEstPossedeeParTypeAssociationTypeCapacite().clear();
				getEstPossedeeParTypeAssociationTypeCapacite().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_CAPACITE__APOUR_DOCUMENT_ASSOCIE_ASSOCIATION_DOCUMENT_CAPACITE:
				getAPourDocumentAssocieAssociationDocumentCapacite().clear();
				getAPourDocumentAssocieAssociationDocumentCapacite().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_CAPACITE__UNITE:
				unsetUnite();
				return;
			case SchemaPackage.TYPE_CAPACITE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CAPACITE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CAPACITE__CONDITION_LUMIERE:
				unsetConditionLumiere();
				return;
			case SchemaPackage.TYPE_CAPACITE__EST_CAPACITE_ASSOCIATION_ACTIVITE_CAPACITE:
				getEstCapaciteAssociationActiviteCapacite().clear();
				return;
			case SchemaPackage.TYPE_CAPACITE__EST_POSSEDEE_PAR_TYPE_ASSOCIATION_TYPE_CAPACITE:
				getEstPossedeeParTypeAssociationTypeCapacite().clear();
				return;
			case SchemaPackage.TYPE_CAPACITE__APOUR_DOCUMENT_ASSOCIE_ASSOCIATION_DOCUMENT_CAPACITE:
				getAPourDocumentAssocieAssociationDocumentCapacite().clear();
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
			case SchemaPackage.TYPE_CAPACITE__UNITE:
				return isSetUnite();
			case SchemaPackage.TYPE_CAPACITE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_CAPACITE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_CAPACITE__CONDITION_LUMIERE:
				return isSetConditionLumiere();
			case SchemaPackage.TYPE_CAPACITE__EST_CAPACITE_ASSOCIATION_ACTIVITE_CAPACITE:
				return estCapaciteAssociationActiviteCapacite != null && !estCapaciteAssociationActiviteCapacite.isEmpty();
			case SchemaPackage.TYPE_CAPACITE__EST_POSSEDEE_PAR_TYPE_ASSOCIATION_TYPE_CAPACITE:
				return estPossedeeParTypeAssociationTypeCapacite != null && !estPossedeeParTypeAssociationTypeCapacite.isEmpty();
			case SchemaPackage.TYPE_CAPACITE__APOUR_DOCUMENT_ASSOCIE_ASSOCIATION_DOCUMENT_CAPACITE:
				return aPourDocumentAssocieAssociationDocumentCapacite != null && !aPourDocumentAssocieAssociationDocumentCapacite.isEmpty();
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
		result.append(" (unite: ");
		if (uniteESet) result.append(unite); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(", conditionLumiere: ");
		if (conditionLumiereESet) result.append(conditionLumiere); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeCapaciteImpl
