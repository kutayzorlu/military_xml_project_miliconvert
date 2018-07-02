/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociationEXT;
import mpia.meta.TypeDataTypeDateHeure;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEtatElementContexteEtat;
import mpia.schema.TypeEtatElementContexte;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Etat Element Contexte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEtatElementContexteImpl#getEtat <em>Etat</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatElementContexteImpl#getDateEffectiveRelation <em>Date Effective Relation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatElementContexteImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatElementContexteImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatElementContexteImpl#getEstEtabliParEntiteOrganisationnelle <em>Est Etabli Par Entite Organisationnelle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEtatElementContexteImpl extends EObjectImpl implements TypeEtatElementContexte {
	/**
	 * The default value of the '{@link #getEtat() <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtat()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatElementContexteEtat ETAT_EDEFAULT = TypeDictionaryDicoEtatElementContexteEtat.ADDITN;

	/**
	 * The cached value of the '{@link #getEtat() <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtat()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatElementContexteEtat etat = ETAT_EDEFAULT;

	/**
	 * This is true if the Etat attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatESet;

	/**
	 * The cached value of the '{@link #getDateEffectiveRelation() <em>Date Effective Relation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateEffectiveRelation()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDateHeure dateEffectiveRelation;

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
	 * The cached value of the '{@link #getEstEtabliParEntiteOrganisationnelle() <em>Est Etabli Par Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstEtabliParEntiteOrganisationnelle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT estEtabliParEntiteOrganisationnelle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEtatElementContexteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEtatElementContexte();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatElementContexteEtat getEtat() {
		return etat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtat(TypeDictionaryDicoEtatElementContexteEtat newEtat) {
		TypeDictionaryDicoEtatElementContexteEtat oldEtat = etat;
		etat = newEtat == null ? ETAT_EDEFAULT : newEtat;
		boolean oldEtatESet = etatESet;
		etatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__ETAT, oldEtat, etat, !oldEtatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtat() {
		TypeDictionaryDicoEtatElementContexteEtat oldEtat = etat;
		boolean oldEtatESet = etatESet;
		etat = ETAT_EDEFAULT;
		etatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__ETAT, oldEtat, ETAT_EDEFAULT, oldEtatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEtat() {
		return etatESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDateHeure getDateEffectiveRelation() {
		return dateEffectiveRelation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateEffectiveRelation(TypeDataTypeDateHeure newDateEffectiveRelation, NotificationChain msgs) {
		TypeDataTypeDateHeure oldDateEffectiveRelation = dateEffectiveRelation;
		dateEffectiveRelation = newDateEffectiveRelation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__DATE_EFFECTIVE_RELATION, oldDateEffectiveRelation, newDateEffectiveRelation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateEffectiveRelation(TypeDataTypeDateHeure newDateEffectiveRelation) {
		if (newDateEffectiveRelation != dateEffectiveRelation) {
			NotificationChain msgs = null;
			if (dateEffectiveRelation != null)
				msgs = ((InternalEObject)dateEffectiveRelation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__DATE_EFFECTIVE_RELATION, null, msgs);
			if (newDateEffectiveRelation != null)
				msgs = ((InternalEObject)newDateEffectiveRelation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__DATE_EFFECTIVE_RELATION, null, msgs);
			msgs = basicSetDateEffectiveRelation(newDateEffectiveRelation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__DATE_EFFECTIVE_RELATION, newDateEffectiveRelation, newDateEffectiveRelation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getEstEtabliParEntiteOrganisationnelle() {
		return estEtabliParEntiteOrganisationnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstEtabliParEntiteOrganisationnelle(TypeAssociationEXT newEstEtabliParEntiteOrganisationnelle, NotificationChain msgs) {
		TypeAssociationEXT oldEstEtabliParEntiteOrganisationnelle = estEtabliParEntiteOrganisationnelle;
		estEtabliParEntiteOrganisationnelle = newEstEtabliParEntiteOrganisationnelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__EST_ETABLI_PAR_ENTITE_ORGANISATIONNELLE, oldEstEtabliParEntiteOrganisationnelle, newEstEtabliParEntiteOrganisationnelle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstEtabliParEntiteOrganisationnelle(TypeAssociationEXT newEstEtabliParEntiteOrganisationnelle) {
		if (newEstEtabliParEntiteOrganisationnelle != estEtabliParEntiteOrganisationnelle) {
			NotificationChain msgs = null;
			if (estEtabliParEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)estEtabliParEntiteOrganisationnelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__EST_ETABLI_PAR_ENTITE_ORGANISATIONNELLE, null, msgs);
			if (newEstEtabliParEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)newEstEtabliParEntiteOrganisationnelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__EST_ETABLI_PAR_ENTITE_ORGANISATIONNELLE, null, msgs);
			msgs = basicSetEstEtabliParEntiteOrganisationnelle(newEstEtabliParEntiteOrganisationnelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__EST_ETABLI_PAR_ENTITE_ORGANISATIONNELLE, newEstEtabliParEntiteOrganisationnelle, newEstEtabliParEntiteOrganisationnelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__DATE_EFFECTIVE_RELATION:
				return basicSetDateEffectiveRelation(null, msgs);
			case SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__EST_ETABLI_PAR_ENTITE_ORGANISATIONNELLE:
				return basicSetEstEtabliParEntiteOrganisationnelle(null, msgs);
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
			case SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__ETAT:
				return getEtat();
			case SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__DATE_EFFECTIVE_RELATION:
				return getDateEffectiveRelation();
			case SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__CE:
				return getCE();
			case SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__EST_ETABLI_PAR_ENTITE_ORGANISATIONNELLE:
				return getEstEtabliParEntiteOrganisationnelle();
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
			case SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__ETAT:
				setEtat((TypeDictionaryDicoEtatElementContexteEtat)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__DATE_EFFECTIVE_RELATION:
				setDateEffectiveRelation((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__EST_ETABLI_PAR_ENTITE_ORGANISATIONNELLE:
				setEstEtabliParEntiteOrganisationnelle((TypeAssociationEXT)newValue);
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
			case SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__ETAT:
				unsetEtat();
				return;
			case SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__DATE_EFFECTIVE_RELATION:
				setDateEffectiveRelation((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__EST_ETABLI_PAR_ENTITE_ORGANISATIONNELLE:
				setEstEtabliParEntiteOrganisationnelle((TypeAssociationEXT)null);
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
			case SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__ETAT:
				return isSetEtat();
			case SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__DATE_EFFECTIVE_RELATION:
				return dateEffectiveRelation != null;
			case SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ETAT_ELEMENT_CONTEXTE__EST_ETABLI_PAR_ENTITE_ORGANISATIONNELLE:
				return estEtabliParEntiteOrganisationnelle != null;
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
		result.append(" (etat: ");
		if (etatESet) result.append(etat); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeEtatElementContexteImpl
