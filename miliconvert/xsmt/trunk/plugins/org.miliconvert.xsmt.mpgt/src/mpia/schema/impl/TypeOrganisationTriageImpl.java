/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeOrganisationTriage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Organisation Triage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeOrganisationTriageImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganisationTriageImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganisationTriageImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeOrganisationTriageImpl#getVautPourZoneLogistique <em>Vaut Pour Zone Logistique</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeOrganisationTriageImpl extends EObjectImpl implements TypeOrganisationTriage {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

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
	 * The cached value of the '{@link #getVautPourZoneLogistique() <em>Vaut Pour Zone Logistique</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVautPourZoneLogistique()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation vautPourZoneLogistique;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeOrganisationTriageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeOrganisationTriage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISATION_TRIAGE__DESCRIPTION, oldDescription, description));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISATION_TRIAGE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISATION_TRIAGE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getVautPourZoneLogistique() {
		return vautPourZoneLogistique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVautPourZoneLogistique(TypeAssociation newVautPourZoneLogistique, NotificationChain msgs) {
		TypeAssociation oldVautPourZoneLogistique = vautPourZoneLogistique;
		vautPourZoneLogistique = newVautPourZoneLogistique;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISATION_TRIAGE__VAUT_POUR_ZONE_LOGISTIQUE, oldVautPourZoneLogistique, newVautPourZoneLogistique);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVautPourZoneLogistique(TypeAssociation newVautPourZoneLogistique) {
		if (newVautPourZoneLogistique != vautPourZoneLogistique) {
			NotificationChain msgs = null;
			if (vautPourZoneLogistique != null)
				msgs = ((InternalEObject)vautPourZoneLogistique).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ORGANISATION_TRIAGE__VAUT_POUR_ZONE_LOGISTIQUE, null, msgs);
			if (newVautPourZoneLogistique != null)
				msgs = ((InternalEObject)newVautPourZoneLogistique).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ORGANISATION_TRIAGE__VAUT_POUR_ZONE_LOGISTIQUE, null, msgs);
			msgs = basicSetVautPourZoneLogistique(newVautPourZoneLogistique, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ORGANISATION_TRIAGE__VAUT_POUR_ZONE_LOGISTIQUE, newVautPourZoneLogistique, newVautPourZoneLogistique));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ORGANISATION_TRIAGE__VAUT_POUR_ZONE_LOGISTIQUE:
				return basicSetVautPourZoneLogistique(null, msgs);
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
			case SchemaPackage.TYPE_ORGANISATION_TRIAGE__DESCRIPTION:
				return getDescription();
			case SchemaPackage.TYPE_ORGANISATION_TRIAGE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_ORGANISATION_TRIAGE__CE:
				return getCE();
			case SchemaPackage.TYPE_ORGANISATION_TRIAGE__VAUT_POUR_ZONE_LOGISTIQUE:
				return getVautPourZoneLogistique();
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
			case SchemaPackage.TYPE_ORGANISATION_TRIAGE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISATION_TRIAGE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISATION_TRIAGE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_ORGANISATION_TRIAGE__VAUT_POUR_ZONE_LOGISTIQUE:
				setVautPourZoneLogistique((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_ORGANISATION_TRIAGE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ORGANISATION_TRIAGE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ORGANISATION_TRIAGE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ORGANISATION_TRIAGE__VAUT_POUR_ZONE_LOGISTIQUE:
				setVautPourZoneLogistique((TypeAssociation)null);
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
			case SchemaPackage.TYPE_ORGANISATION_TRIAGE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SchemaPackage.TYPE_ORGANISATION_TRIAGE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_ORGANISATION_TRIAGE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_ORGANISATION_TRIAGE__VAUT_POUR_ZONE_LOGISTIQUE:
				return vautPourZoneLogistique != null;
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
		result.append(" (description: ");
		result.append(description);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeOrganisationTriageImpl
