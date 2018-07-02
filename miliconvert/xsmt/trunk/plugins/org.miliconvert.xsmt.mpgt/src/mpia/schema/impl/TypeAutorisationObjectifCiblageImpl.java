/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAutorisationObjectifCiblage;
import mpia.schema.TypeDictionaryDicoAutorisationObjectifCiblageApprobation;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Autorisation Objectif Ciblage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAutorisationObjectifCiblageImpl#getApprobation <em>Approbation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutorisationObjectifCiblageImpl#getPriorite <em>Priorite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutorisationObjectifCiblageImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutorisationObjectifCiblageImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAutorisationObjectifCiblageImpl#getEstRapporteeParRapport <em>Est Rapportee Par Rapport</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAutorisationObjectifCiblageImpl extends EObjectImpl implements TypeAutorisationObjectifCiblage {
	/**
	 * The default value of the '{@link #getApprobation() <em>Approbation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprobation()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAutorisationObjectifCiblageApprobation APPROBATION_EDEFAULT = TypeDictionaryDicoAutorisationObjectifCiblageApprobation.APPAVL;

	/**
	 * The cached value of the '{@link #getApprobation() <em>Approbation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprobation()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAutorisationObjectifCiblageApprobation approbation = APPROBATION_EDEFAULT;

	/**
	 * This is true if the Approbation attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean approbationESet;

	/**
	 * The default value of the '{@link #getPriorite() <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorite()
	 * @generated
	 * @ordered
	 */
	protected static final long PRIORITE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getPriorite() <em>Priorite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorite()
	 * @generated
	 * @ordered
	 */
	protected long priorite = PRIORITE_EDEFAULT;

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
	 * The cached value of the '{@link #getEstRapporteeParRapport() <em>Est Rapportee Par Rapport</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstRapporteeParRapport()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estRapporteeParRapport;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAutorisationObjectifCiblageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAutorisationObjectifCiblage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAutorisationObjectifCiblageApprobation getApprobation() {
		return approbation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApprobation(TypeDictionaryDicoAutorisationObjectifCiblageApprobation newApprobation) {
		TypeDictionaryDicoAutorisationObjectifCiblageApprobation oldApprobation = approbation;
		approbation = newApprobation == null ? APPROBATION_EDEFAULT : newApprobation;
		boolean oldApprobationESet = approbationESet;
		approbationESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__APPROBATION, oldApprobation, approbation, !oldApprobationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetApprobation() {
		TypeDictionaryDicoAutorisationObjectifCiblageApprobation oldApprobation = approbation;
		boolean oldApprobationESet = approbationESet;
		approbation = APPROBATION_EDEFAULT;
		approbationESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__APPROBATION, oldApprobation, APPROBATION_EDEFAULT, oldApprobationESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetApprobation() {
		return approbationESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPriorite() {
		return priorite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorite(long newPriorite) {
		long oldPriorite = priorite;
		priorite = newPriorite;
		boolean oldPrioriteESet = prioriteESet;
		prioriteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__PRIORITE, oldPriorite, priorite, !oldPrioriteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPriorite() {
		long oldPriorite = priorite;
		boolean oldPrioriteESet = prioriteESet;
		priorite = PRIORITE_EDEFAULT;
		prioriteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__PRIORITE, oldPriorite, PRIORITE_EDEFAULT, oldPrioriteESet));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstRapporteeParRapport() {
		return estRapporteeParRapport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstRapporteeParRapport(TypeAssociation newEstRapporteeParRapport, NotificationChain msgs) {
		TypeAssociation oldEstRapporteeParRapport = estRapporteeParRapport;
		estRapporteeParRapport = newEstRapporteeParRapport;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__EST_RAPPORTEE_PAR_RAPPORT, oldEstRapporteeParRapport, newEstRapporteeParRapport);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstRapporteeParRapport(TypeAssociation newEstRapporteeParRapport) {
		if (newEstRapporteeParRapport != estRapporteeParRapport) {
			NotificationChain msgs = null;
			if (estRapporteeParRapport != null)
				msgs = ((InternalEObject)estRapporteeParRapport).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			if (newEstRapporteeParRapport != null)
				msgs = ((InternalEObject)newEstRapporteeParRapport).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__EST_RAPPORTEE_PAR_RAPPORT, null, msgs);
			msgs = basicSetEstRapporteeParRapport(newEstRapporteeParRapport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__EST_RAPPORTEE_PAR_RAPPORT, newEstRapporteeParRapport, newEstRapporteeParRapport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__EST_RAPPORTEE_PAR_RAPPORT:
				return basicSetEstRapporteeParRapport(null, msgs);
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
			case SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__APPROBATION:
				return getApprobation();
			case SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__PRIORITE:
				return new Long(getPriorite());
			case SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__CE:
				return getCE();
			case SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__EST_RAPPORTEE_PAR_RAPPORT:
				return getEstRapporteeParRapport();
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
			case SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__APPROBATION:
				setApprobation((TypeDictionaryDicoAutorisationObjectifCiblageApprobation)newValue);
				return;
			case SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__PRIORITE:
				setPriorite(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__EST_RAPPORTEE_PAR_RAPPORT:
				setEstRapporteeParRapport((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__APPROBATION:
				unsetApprobation();
				return;
			case SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__PRIORITE:
				unsetPriorite();
				return;
			case SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__EST_RAPPORTEE_PAR_RAPPORT:
				setEstRapporteeParRapport((TypeAssociation)null);
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
			case SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__APPROBATION:
				return isSetApprobation();
			case SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__PRIORITE:
				return isSetPriorite();
			case SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_AUTORISATION_OBJECTIF_CIBLAGE__EST_RAPPORTEE_PAR_RAPPORT:
				return estRapporteeParRapport != null;
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
		result.append(" (approbation: ");
		if (approbationESet) result.append(approbation); else result.append("<unset>");
		result.append(", priorite: ");
		if (prioriteESet) result.append(priorite); else result.append("<unset>");
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeAutorisationObjectifCiblageImpl
