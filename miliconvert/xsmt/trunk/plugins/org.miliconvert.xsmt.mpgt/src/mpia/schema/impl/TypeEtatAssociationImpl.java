/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeDataTypeDateHeure;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoEtatAssociation;
import mpia.schema.TypeEtatAssociation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Etat Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeEtatAssociationImpl#getEtat <em>Etat</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatAssociationImpl#getDate <em>Date</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatAssociationImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatAssociationImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeEtatAssociationImpl#getEstEtabliParEntiteOrganisationnelle <em>Est Etabli Par Entite Organisationnelle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeEtatAssociationImpl extends EObjectImpl implements TypeEtatAssociation {
	/**
	 * The default value of the '{@link #getEtat() <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtat()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoEtatAssociation ETAT_EDEFAULT = TypeDictionaryDicoEtatAssociation.START;

	/**
	 * The cached value of the '{@link #getEtat() <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtat()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoEtatAssociation etat = ETAT_EDEFAULT;

	/**
	 * This is true if the Etat attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean etatESet;

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
	 * The cached value of the '{@link #getEstEtabliParEntiteOrganisationnelle() <em>Est Etabli Par Entite Organisationnelle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstEtabliParEntiteOrganisationnelle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estEtabliParEntiteOrganisationnelle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeEtatAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeEtatAssociation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoEtatAssociation getEtat() {
		return etat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtat(TypeDictionaryDicoEtatAssociation newEtat) {
		TypeDictionaryDicoEtatAssociation oldEtat = etat;
		etat = newEtat == null ? ETAT_EDEFAULT : newEtat;
		boolean oldEtatESet = etatESet;
		etatESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ASSOCIATION__ETAT, oldEtat, etat, !oldEtatESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetEtat() {
		TypeDictionaryDicoEtatAssociation oldEtat = etat;
		boolean oldEtatESet = etatESet;
		etat = ETAT_EDEFAULT;
		etatESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ETAT_ASSOCIATION__ETAT, oldEtat, ETAT_EDEFAULT, oldEtatESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ASSOCIATION__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_ASSOCIATION__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_ASSOCIATION__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ASSOCIATION__DATE, newDate, newDate));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ASSOCIATION__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ASSOCIATION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstEtabliParEntiteOrganisationnelle() {
		return estEtabliParEntiteOrganisationnelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstEtabliParEntiteOrganisationnelle(TypeAssociation newEstEtabliParEntiteOrganisationnelle, NotificationChain msgs) {
		TypeAssociation oldEstEtabliParEntiteOrganisationnelle = estEtabliParEntiteOrganisationnelle;
		estEtabliParEntiteOrganisationnelle = newEstEtabliParEntiteOrganisationnelle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ASSOCIATION__EST_ETABLI_PAR_ENTITE_ORGANISATIONNELLE, oldEstEtabliParEntiteOrganisationnelle, newEstEtabliParEntiteOrganisationnelle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstEtabliParEntiteOrganisationnelle(TypeAssociation newEstEtabliParEntiteOrganisationnelle) {
		if (newEstEtabliParEntiteOrganisationnelle != estEtabliParEntiteOrganisationnelle) {
			NotificationChain msgs = null;
			if (estEtabliParEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)estEtabliParEntiteOrganisationnelle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_ASSOCIATION__EST_ETABLI_PAR_ENTITE_ORGANISATIONNELLE, null, msgs);
			if (newEstEtabliParEntiteOrganisationnelle != null)
				msgs = ((InternalEObject)newEstEtabliParEntiteOrganisationnelle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ETAT_ASSOCIATION__EST_ETABLI_PAR_ENTITE_ORGANISATIONNELLE, null, msgs);
			msgs = basicSetEstEtabliParEntiteOrganisationnelle(newEstEtabliParEntiteOrganisationnelle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ETAT_ASSOCIATION__EST_ETABLI_PAR_ENTITE_ORGANISATIONNELLE, newEstEtabliParEntiteOrganisationnelle, newEstEtabliParEntiteOrganisationnelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ETAT_ASSOCIATION__DATE:
				return basicSetDate(null, msgs);
			case SchemaPackage.TYPE_ETAT_ASSOCIATION__EST_ETABLI_PAR_ENTITE_ORGANISATIONNELLE:
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
			case SchemaPackage.TYPE_ETAT_ASSOCIATION__ETAT:
				return getEtat();
			case SchemaPackage.TYPE_ETAT_ASSOCIATION__DATE:
				return getDate();
			case SchemaPackage.TYPE_ETAT_ASSOCIATION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ETAT_ASSOCIATION__CE:
				return getCE();
			case SchemaPackage.TYPE_ETAT_ASSOCIATION__EST_ETABLI_PAR_ENTITE_ORGANISATIONNELLE:
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
			case SchemaPackage.TYPE_ETAT_ASSOCIATION__ETAT:
				setEtat((TypeDictionaryDicoEtatAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_ASSOCIATION__DATE:
				setDate((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_ASSOCIATION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_ASSOCIATION__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ETAT_ASSOCIATION__EST_ETABLI_PAR_ENTITE_ORGANISATIONNELLE:
				setEstEtabliParEntiteOrganisationnelle((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ETAT_ASSOCIATION__ETAT:
				unsetEtat();
				return;
			case SchemaPackage.TYPE_ETAT_ASSOCIATION__DATE:
				setDate((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_ETAT_ASSOCIATION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_ASSOCIATION__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ETAT_ASSOCIATION__EST_ETABLI_PAR_ENTITE_ORGANISATIONNELLE:
				setEstEtabliParEntiteOrganisationnelle((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ETAT_ASSOCIATION__ETAT:
				return isSetEtat();
			case SchemaPackage.TYPE_ETAT_ASSOCIATION__DATE:
				return date != null;
			case SchemaPackage.TYPE_ETAT_ASSOCIATION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ETAT_ASSOCIATION__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ETAT_ASSOCIATION__EST_ETABLI_PAR_ENTITE_ORGANISATIONNELLE:
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

} //TypeEtatAssociationImpl
