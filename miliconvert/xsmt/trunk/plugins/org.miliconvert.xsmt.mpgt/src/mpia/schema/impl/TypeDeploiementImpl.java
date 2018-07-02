/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import mpia.meta.TypeAssociation;
import mpia.meta.TypeAssociationEXT;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDeploiement;

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
 * An implementation of the model object '<em><b>Type Deploiement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeDeploiementImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDeploiementImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDeploiementImpl#getAppliquePourHoraireManoeuvre <em>Applique Pour Horaire Manoeuvre</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDeploiementImpl#getAPourUniteRattacheeUnite <em>APour Unite Rattachee Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeDeploiementImpl#getAPourUniteLogistiqueUnite <em>APour Unite Logistique Unite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDeploiementImpl extends EObjectImpl implements TypeDeploiement {
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
	 * The cached value of the '{@link #getAppliquePourHoraireManoeuvre() <em>Applique Pour Horaire Manoeuvre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAppliquePourHoraireManoeuvre()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation appliquePourHoraireManoeuvre;

	/**
	 * The cached value of the '{@link #getAPourUniteRattacheeUnite() <em>APour Unite Rattachee Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteRattacheeUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourUniteRattacheeUnite;

	/**
	 * The cached value of the '{@link #getAPourUniteLogistiqueUnite() <em>APour Unite Logistique Unite</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteLogistiqueUnite()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociationEXT> aPourUniteLogistiqueUnite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDeploiementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeDeploiement();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPLOIEMENT__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPLOIEMENT__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAppliquePourHoraireManoeuvre() {
		return appliquePourHoraireManoeuvre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAppliquePourHoraireManoeuvre(TypeAssociation newAppliquePourHoraireManoeuvre, NotificationChain msgs) {
		TypeAssociation oldAppliquePourHoraireManoeuvre = appliquePourHoraireManoeuvre;
		appliquePourHoraireManoeuvre = newAppliquePourHoraireManoeuvre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPLOIEMENT__APPLIQUE_POUR_HORAIRE_MANOEUVRE, oldAppliquePourHoraireManoeuvre, newAppliquePourHoraireManoeuvre);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAppliquePourHoraireManoeuvre(TypeAssociation newAppliquePourHoraireManoeuvre) {
		if (newAppliquePourHoraireManoeuvre != appliquePourHoraireManoeuvre) {
			NotificationChain msgs = null;
			if (appliquePourHoraireManoeuvre != null)
				msgs = ((InternalEObject)appliquePourHoraireManoeuvre).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEPLOIEMENT__APPLIQUE_POUR_HORAIRE_MANOEUVRE, null, msgs);
			if (newAppliquePourHoraireManoeuvre != null)
				msgs = ((InternalEObject)newAppliquePourHoraireManoeuvre).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEPLOIEMENT__APPLIQUE_POUR_HORAIRE_MANOEUVRE, null, msgs);
			msgs = basicSetAppliquePourHoraireManoeuvre(newAppliquePourHoraireManoeuvre, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPLOIEMENT__APPLIQUE_POUR_HORAIRE_MANOEUVRE, newAppliquePourHoraireManoeuvre, newAppliquePourHoraireManoeuvre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourUniteRattacheeUnite() {
		return aPourUniteRattacheeUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourUniteRattacheeUnite(TypeAssociationEXT newAPourUniteRattacheeUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourUniteRattacheeUnite = aPourUniteRattacheeUnite;
		aPourUniteRattacheeUnite = newAPourUniteRattacheeUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPLOIEMENT__APOUR_UNITE_RATTACHEE_UNITE, oldAPourUniteRattacheeUnite, newAPourUniteRattacheeUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourUniteRattacheeUnite(TypeAssociationEXT newAPourUniteRattacheeUnite) {
		if (newAPourUniteRattacheeUnite != aPourUniteRattacheeUnite) {
			NotificationChain msgs = null;
			if (aPourUniteRattacheeUnite != null)
				msgs = ((InternalEObject)aPourUniteRattacheeUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEPLOIEMENT__APOUR_UNITE_RATTACHEE_UNITE, null, msgs);
			if (newAPourUniteRattacheeUnite != null)
				msgs = ((InternalEObject)newAPourUniteRattacheeUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_DEPLOIEMENT__APOUR_UNITE_RATTACHEE_UNITE, null, msgs);
			msgs = basicSetAPourUniteRattacheeUnite(newAPourUniteRattacheeUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_DEPLOIEMENT__APOUR_UNITE_RATTACHEE_UNITE, newAPourUniteRattacheeUnite, newAPourUniteRattacheeUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociationEXT> getAPourUniteLogistiqueUnite() {
		if (aPourUniteLogistiqueUnite == null) {
			aPourUniteLogistiqueUnite = new EObjectContainmentEList<TypeAssociationEXT>(TypeAssociationEXT.class, this, SchemaPackage.TYPE_DEPLOIEMENT__APOUR_UNITE_LOGISTIQUE_UNITE);
		}
		return aPourUniteLogistiqueUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_DEPLOIEMENT__APPLIQUE_POUR_HORAIRE_MANOEUVRE:
				return basicSetAppliquePourHoraireManoeuvre(null, msgs);
			case SchemaPackage.TYPE_DEPLOIEMENT__APOUR_UNITE_RATTACHEE_UNITE:
				return basicSetAPourUniteRattacheeUnite(null, msgs);
			case SchemaPackage.TYPE_DEPLOIEMENT__APOUR_UNITE_LOGISTIQUE_UNITE:
				return ((InternalEList<?>)getAPourUniteLogistiqueUnite()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_DEPLOIEMENT__CTE:
				return getCTE();
			case SchemaPackage.TYPE_DEPLOIEMENT__CE:
				return getCE();
			case SchemaPackage.TYPE_DEPLOIEMENT__APPLIQUE_POUR_HORAIRE_MANOEUVRE:
				return getAppliquePourHoraireManoeuvre();
			case SchemaPackage.TYPE_DEPLOIEMENT__APOUR_UNITE_RATTACHEE_UNITE:
				return getAPourUniteRattacheeUnite();
			case SchemaPackage.TYPE_DEPLOIEMENT__APOUR_UNITE_LOGISTIQUE_UNITE:
				return getAPourUniteLogistiqueUnite();
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
			case SchemaPackage.TYPE_DEPLOIEMENT__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT__APPLIQUE_POUR_HORAIRE_MANOEUVRE:
				setAppliquePourHoraireManoeuvre((TypeAssociation)newValue);
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT__APOUR_UNITE_RATTACHEE_UNITE:
				setAPourUniteRattacheeUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT__APOUR_UNITE_LOGISTIQUE_UNITE:
				getAPourUniteLogistiqueUnite().clear();
				getAPourUniteLogistiqueUnite().addAll((Collection<? extends TypeAssociationEXT>)newValue);
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
			case SchemaPackage.TYPE_DEPLOIEMENT__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT__APPLIQUE_POUR_HORAIRE_MANOEUVRE:
				setAppliquePourHoraireManoeuvre((TypeAssociation)null);
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT__APOUR_UNITE_RATTACHEE_UNITE:
				setAPourUniteRattacheeUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_DEPLOIEMENT__APOUR_UNITE_LOGISTIQUE_UNITE:
				getAPourUniteLogistiqueUnite().clear();
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
			case SchemaPackage.TYPE_DEPLOIEMENT__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_DEPLOIEMENT__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_DEPLOIEMENT__APPLIQUE_POUR_HORAIRE_MANOEUVRE:
				return appliquePourHoraireManoeuvre != null;
			case SchemaPackage.TYPE_DEPLOIEMENT__APOUR_UNITE_RATTACHEE_UNITE:
				return aPourUniteRattacheeUnite != null;
			case SchemaPackage.TYPE_DEPLOIEMENT__APOUR_UNITE_LOGISTIQUE_UNITE:
				return aPourUniteLogistiqueUnite != null && !aPourUniteLogistiqueUnite.isEmpty();
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

} //TypeDeploiementImpl
