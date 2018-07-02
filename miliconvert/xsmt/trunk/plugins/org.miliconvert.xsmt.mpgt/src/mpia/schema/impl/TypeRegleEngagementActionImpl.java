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
import mpia.schema.TypeEtatRegleEngagement;
import mpia.schema.TypeRegleEngagementAction;

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
 * An implementation of the model object '<em><b>Type Regle Engagement Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeRegleEngagementActionImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRegleEngagementActionImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRegleEngagementActionImpl#getEstDesigneeParRegleEngagement <em>Est Designee Par Regle Engagement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRegleEngagementActionImpl#getAPourEtatEtatRegleEngagement <em>APour Etat Etat Regle Engagement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeRegleEngagementActionImpl extends EObjectImpl implements TypeRegleEngagementAction {
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
	 * The cached value of the '{@link #getEstDesigneeParRegleEngagement() <em>Est Designee Par Regle Engagement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstDesigneeParRegleEngagement()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation estDesigneeParRegleEngagement;

	/**
	 * The cached value of the '{@link #getAPourEtatEtatRegleEngagement() <em>APour Etat Etat Regle Engagement</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourEtatEtatRegleEngagement()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeEtatRegleEngagement> aPourEtatEtatRegleEngagement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeRegleEngagementActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeRegleEngagementAction();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_REGLE_ENGAGEMENT_ACTION__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_REGLE_ENGAGEMENT_ACTION__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getEstDesigneeParRegleEngagement() {
		return estDesigneeParRegleEngagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEstDesigneeParRegleEngagement(TypeAssociation newEstDesigneeParRegleEngagement, NotificationChain msgs) {
		TypeAssociation oldEstDesigneeParRegleEngagement = estDesigneeParRegleEngagement;
		estDesigneeParRegleEngagement = newEstDesigneeParRegleEngagement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_REGLE_ENGAGEMENT_ACTION__EST_DESIGNEE_PAR_REGLE_ENGAGEMENT, oldEstDesigneeParRegleEngagement, newEstDesigneeParRegleEngagement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstDesigneeParRegleEngagement(TypeAssociation newEstDesigneeParRegleEngagement) {
		if (newEstDesigneeParRegleEngagement != estDesigneeParRegleEngagement) {
			NotificationChain msgs = null;
			if (estDesigneeParRegleEngagement != null)
				msgs = ((InternalEObject)estDesigneeParRegleEngagement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_REGLE_ENGAGEMENT_ACTION__EST_DESIGNEE_PAR_REGLE_ENGAGEMENT, null, msgs);
			if (newEstDesigneeParRegleEngagement != null)
				msgs = ((InternalEObject)newEstDesigneeParRegleEngagement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_REGLE_ENGAGEMENT_ACTION__EST_DESIGNEE_PAR_REGLE_ENGAGEMENT, null, msgs);
			msgs = basicSetEstDesigneeParRegleEngagement(newEstDesigneeParRegleEngagement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_REGLE_ENGAGEMENT_ACTION__EST_DESIGNEE_PAR_REGLE_ENGAGEMENT, newEstDesigneeParRegleEngagement, newEstDesigneeParRegleEngagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeEtatRegleEngagement> getAPourEtatEtatRegleEngagement() {
		if (aPourEtatEtatRegleEngagement == null) {
			aPourEtatEtatRegleEngagement = new EObjectContainmentEList<TypeEtatRegleEngagement>(TypeEtatRegleEngagement.class, this, SchemaPackage.TYPE_REGLE_ENGAGEMENT_ACTION__APOUR_ETAT_ETAT_REGLE_ENGAGEMENT);
		}
		return aPourEtatEtatRegleEngagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT_ACTION__EST_DESIGNEE_PAR_REGLE_ENGAGEMENT:
				return basicSetEstDesigneeParRegleEngagement(null, msgs);
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT_ACTION__APOUR_ETAT_ETAT_REGLE_ENGAGEMENT:
				return ((InternalEList<?>)getAPourEtatEtatRegleEngagement()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT_ACTION__CTE:
				return getCTE();
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT_ACTION__CE:
				return getCE();
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT_ACTION__EST_DESIGNEE_PAR_REGLE_ENGAGEMENT:
				return getEstDesigneeParRegleEngagement();
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT_ACTION__APOUR_ETAT_ETAT_REGLE_ENGAGEMENT:
				return getAPourEtatEtatRegleEngagement();
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
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT_ACTION__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT_ACTION__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT_ACTION__EST_DESIGNEE_PAR_REGLE_ENGAGEMENT:
				setEstDesigneeParRegleEngagement((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT_ACTION__APOUR_ETAT_ETAT_REGLE_ENGAGEMENT:
				getAPourEtatEtatRegleEngagement().clear();
				getAPourEtatEtatRegleEngagement().addAll((Collection<? extends TypeEtatRegleEngagement>)newValue);
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
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT_ACTION__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT_ACTION__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT_ACTION__EST_DESIGNEE_PAR_REGLE_ENGAGEMENT:
				setEstDesigneeParRegleEngagement((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT_ACTION__APOUR_ETAT_ETAT_REGLE_ENGAGEMENT:
				getAPourEtatEtatRegleEngagement().clear();
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
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT_ACTION__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT_ACTION__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT_ACTION__EST_DESIGNEE_PAR_REGLE_ENGAGEMENT:
				return estDesigneeParRegleEngagement != null;
			case SchemaPackage.TYPE_REGLE_ENGAGEMENT_ACTION__APOUR_ETAT_ETAT_REGLE_ENGAGEMENT:
				return aPourEtatEtatRegleEngagement != null && !aPourEtatEtatRegleEngagement.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //TypeRegleEngagementActionImpl
