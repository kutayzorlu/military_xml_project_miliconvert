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
import mpia.schema.TypeAssociationGroupeInfoOpsPlanOuOrdre;
import mpia.schema.TypeDictionaryDicoEtatAssociation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Association Groupe Info Ops Plan Ou Ordre</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAssociationGroupeInfoOpsPlanOuOrdreImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationGroupeInfoOpsPlanOuOrdreImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationGroupeInfoOpsPlanOuOrdreImpl#getEtat <em>Etat</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationGroupeInfoOpsPlanOuOrdreImpl#getDate <em>Date</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationGroupeInfoOpsPlanOuOrdreImpl#getEstInclusDansGroupeInformationsOperationnelles <em>Est Inclus Dans Groupe Informations Operationnelles</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAssociationGroupeInfoOpsPlanOuOrdreImpl#getCitesPlanOuOrdre <em>Cites Plan Ou Ordre</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAssociationGroupeInfoOpsPlanOuOrdreImpl extends EObjectImpl implements TypeAssociationGroupeInfoOpsPlanOuOrdre {
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
	 * The cached value of the '{@link #getEstInclusDansGroupeInformationsOperationnelles() <em>Est Inclus Dans Groupe Informations Operationnelles</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstInclusDansGroupeInformationsOperationnelles()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estInclusDansGroupeInformationsOperationnelles;

	/**
	 * The cached value of the '{@link #getCitesPlanOuOrdre() <em>Cites Plan Ou Ordre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCitesPlanOuOrdre()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation citesPlanOuOrdre;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAssociationGroupeInfoOpsPlanOuOrdreImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAssociationGroupeInfoOpsPlanOuOrdre();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__CE, oldCE, cE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__ETAT, oldEtat, etat, !oldEtatESet));
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
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__ETAT, oldEtat, ETAT_EDEFAULT, oldEtatESet));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__DATE, oldDate, newDate);
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
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstInclusDansGroupeInformationsOperationnelles() {
		return estInclusDansGroupeInformationsOperationnelles;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstInclusDansGroupeInformationsOperationnelles(TypeAssociation newEstInclusDansGroupeInformationsOperationnelles, NotificationChain msgs) {
		TypeAssociation oldEstInclusDansGroupeInformationsOperationnelles = estInclusDansGroupeInformationsOperationnelles;
		estInclusDansGroupeInformationsOperationnelles = newEstInclusDansGroupeInformationsOperationnelles;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__EST_INCLUS_DANS_GROUPE_INFORMATIONS_OPERATIONNELLES, oldEstInclusDansGroupeInformationsOperationnelles, newEstInclusDansGroupeInformationsOperationnelles);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstInclusDansGroupeInformationsOperationnelles(TypeAssociation newEstInclusDansGroupeInformationsOperationnelles) {
		if (newEstInclusDansGroupeInformationsOperationnelles != estInclusDansGroupeInformationsOperationnelles) {
			NotificationChain msgs = null;
			if (estInclusDansGroupeInformationsOperationnelles != null)
				msgs = ((InternalEObject)estInclusDansGroupeInformationsOperationnelles).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__EST_INCLUS_DANS_GROUPE_INFORMATIONS_OPERATIONNELLES, null, msgs);
			if (newEstInclusDansGroupeInformationsOperationnelles != null)
				msgs = ((InternalEObject)newEstInclusDansGroupeInformationsOperationnelles).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__EST_INCLUS_DANS_GROUPE_INFORMATIONS_OPERATIONNELLES, null, msgs);
			msgs = basicSetEstInclusDansGroupeInformationsOperationnelles(newEstInclusDansGroupeInformationsOperationnelles, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__EST_INCLUS_DANS_GROUPE_INFORMATIONS_OPERATIONNELLES, newEstInclusDansGroupeInformationsOperationnelles, newEstInclusDansGroupeInformationsOperationnelles));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getCitesPlanOuOrdre() {
		return citesPlanOuOrdre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCitesPlanOuOrdre(TypeAssociation newCitesPlanOuOrdre, NotificationChain msgs) {
		TypeAssociation oldCitesPlanOuOrdre = citesPlanOuOrdre;
		citesPlanOuOrdre = newCitesPlanOuOrdre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__CITES_PLAN_OU_ORDRE, oldCitesPlanOuOrdre, newCitesPlanOuOrdre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCitesPlanOuOrdre(TypeAssociation newCitesPlanOuOrdre) {
		if (newCitesPlanOuOrdre != citesPlanOuOrdre) {
			NotificationChain msgs = null;
			if (citesPlanOuOrdre != null)
				msgs = ((InternalEObject)citesPlanOuOrdre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__CITES_PLAN_OU_ORDRE, null, msgs);
			if (newCitesPlanOuOrdre != null)
				msgs = ((InternalEObject)newCitesPlanOuOrdre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__CITES_PLAN_OU_ORDRE, null, msgs);
			msgs = basicSetCitesPlanOuOrdre(newCitesPlanOuOrdre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__CITES_PLAN_OU_ORDRE, newCitesPlanOuOrdre, newCitesPlanOuOrdre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__DATE:
				return basicSetDate(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__EST_INCLUS_DANS_GROUPE_INFORMATIONS_OPERATIONNELLES:
				return basicSetEstInclusDansGroupeInformationsOperationnelles(null, msgs);
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__CITES_PLAN_OU_ORDRE:
				return basicSetCitesPlanOuOrdre(null, msgs);
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
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__CE:
				return getCE();
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__ETAT:
				return getEtat();
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__DATE:
				return getDate();
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__EST_INCLUS_DANS_GROUPE_INFORMATIONS_OPERATIONNELLES:
				return getEstInclusDansGroupeInformationsOperationnelles();
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__CITES_PLAN_OU_ORDRE:
				return getCitesPlanOuOrdre();
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
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__ETAT:
				setEtat((TypeDictionaryDicoEtatAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__DATE:
				setDate((TypeDataTypeDateHeure)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__EST_INCLUS_DANS_GROUPE_INFORMATIONS_OPERATIONNELLES:
				setEstInclusDansGroupeInformationsOperationnelles((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__CITES_PLAN_OU_ORDRE:
				setCitesPlanOuOrdre((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__ETAT:
				unsetEtat();
				return;
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__DATE:
				setDate((TypeDataTypeDateHeure)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__EST_INCLUS_DANS_GROUPE_INFORMATIONS_OPERATIONNELLES:
				setEstInclusDansGroupeInformationsOperationnelles((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__CITES_PLAN_OU_ORDRE:
				setCitesPlanOuOrdre((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__ETAT:
				return isSetEtat();
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__DATE:
				return date != null;
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__EST_INCLUS_DANS_GROUPE_INFORMATIONS_OPERATIONNELLES:
				return estInclusDansGroupeInformationsOperationnelles != null;
			case SchemaPackage.TYPE_ASSOCIATION_GROUPE_INFO_OPS_PLAN_OU_ORDRE__CITES_PLAN_OU_ORDRE:
				return citesPlanOuOrdre != null;
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
		result.append(", etat: ");
		if (etatESet) result.append(etat); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeAssociationGroupeInfoOpsPlanOuOrdreImpl
