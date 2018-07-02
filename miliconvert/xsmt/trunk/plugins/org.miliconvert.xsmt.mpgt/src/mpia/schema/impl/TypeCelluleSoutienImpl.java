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
import mpia.schema.TypeCelluleSoutien;

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
 * An implementation of the model object '<em><b>Type Cellule Soutien</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCelluleSoutienImpl#getDescriptionMission <em>Description Mission</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCelluleSoutienImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCelluleSoutienImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCelluleSoutienImpl#getAPourUniteResponsableUnite <em>APour Unite Responsable Unite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCelluleSoutienImpl#getAPourActivitePrincipaleAction <em>APour Activite Principale Action</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCelluleSoutienImpl#getAPourActiviteSecondaireAction <em>APour Activite Secondaire Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCelluleSoutienImpl extends EObjectImpl implements TypeCelluleSoutien {
	/**
	 * The default value of the '{@link #getDescriptionMission() <em>Description Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionMission()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_MISSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescriptionMission() <em>Description Mission</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescriptionMission()
	 * @generated
	 * @ordered
	 */
	protected String descriptionMission = DESCRIPTION_MISSION_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourUniteResponsableUnite() <em>APour Unite Responsable Unite</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourUniteResponsableUnite()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociationEXT aPourUniteResponsableUnite;

	/**
	 * The cached value of the '{@link #getAPourActivitePrincipaleAction() <em>APour Activite Principale Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourActivitePrincipaleAction()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourActivitePrincipaleAction;

	/**
	 * The cached value of the '{@link #getAPourActiviteSecondaireAction() <em>APour Activite Secondaire Action</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourActiviteSecondaireAction()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeAssociation> aPourActiviteSecondaireAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCelluleSoutienImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCelluleSoutien();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescriptionMission() {
		return descriptionMission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescriptionMission(String newDescriptionMission) {
		String oldDescriptionMission = descriptionMission;
		descriptionMission = newDescriptionMission;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CELLULE_SOUTIEN__DESCRIPTION_MISSION, oldDescriptionMission, descriptionMission));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CELLULE_SOUTIEN__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CELLULE_SOUTIEN__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociationEXT getAPourUniteResponsableUnite() {
		return aPourUniteResponsableUnite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourUniteResponsableUnite(TypeAssociationEXT newAPourUniteResponsableUnite, NotificationChain msgs) {
		TypeAssociationEXT oldAPourUniteResponsableUnite = aPourUniteResponsableUnite;
		aPourUniteResponsableUnite = newAPourUniteResponsableUnite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CELLULE_SOUTIEN__APOUR_UNITE_RESPONSABLE_UNITE, oldAPourUniteResponsableUnite, newAPourUniteResponsableUnite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourUniteResponsableUnite(TypeAssociationEXT newAPourUniteResponsableUnite) {
		if (newAPourUniteResponsableUnite != aPourUniteResponsableUnite) {
			NotificationChain msgs = null;
			if (aPourUniteResponsableUnite != null)
				msgs = ((InternalEObject)aPourUniteResponsableUnite).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CELLULE_SOUTIEN__APOUR_UNITE_RESPONSABLE_UNITE, null, msgs);
			if (newAPourUniteResponsableUnite != null)
				msgs = ((InternalEObject)newAPourUniteResponsableUnite).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_CELLULE_SOUTIEN__APOUR_UNITE_RESPONSABLE_UNITE, null, msgs);
			msgs = basicSetAPourUniteResponsableUnite(newAPourUniteResponsableUnite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CELLULE_SOUTIEN__APOUR_UNITE_RESPONSABLE_UNITE, newAPourUniteResponsableUnite, newAPourUniteResponsableUnite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourActivitePrincipaleAction() {
		if (aPourActivitePrincipaleAction == null) {
			aPourActivitePrincipaleAction = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CELLULE_SOUTIEN__APOUR_ACTIVITE_PRINCIPALE_ACTION);
		}
		return aPourActivitePrincipaleAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypeAssociation> getAPourActiviteSecondaireAction() {
		if (aPourActiviteSecondaireAction == null) {
			aPourActiviteSecondaireAction = new EObjectContainmentEList<TypeAssociation>(TypeAssociation.class, this, SchemaPackage.TYPE_CELLULE_SOUTIEN__APOUR_ACTIVITE_SECONDAIRE_ACTION);
		}
		return aPourActiviteSecondaireAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_CELLULE_SOUTIEN__APOUR_UNITE_RESPONSABLE_UNITE:
				return basicSetAPourUniteResponsableUnite(null, msgs);
			case SchemaPackage.TYPE_CELLULE_SOUTIEN__APOUR_ACTIVITE_PRINCIPALE_ACTION:
				return ((InternalEList<?>)getAPourActivitePrincipaleAction()).basicRemove(otherEnd, msgs);
			case SchemaPackage.TYPE_CELLULE_SOUTIEN__APOUR_ACTIVITE_SECONDAIRE_ACTION:
				return ((InternalEList<?>)getAPourActiviteSecondaireAction()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_CELLULE_SOUTIEN__DESCRIPTION_MISSION:
				return getDescriptionMission();
			case SchemaPackage.TYPE_CELLULE_SOUTIEN__CTE:
				return getCTE();
			case SchemaPackage.TYPE_CELLULE_SOUTIEN__CE:
				return getCE();
			case SchemaPackage.TYPE_CELLULE_SOUTIEN__APOUR_UNITE_RESPONSABLE_UNITE:
				return getAPourUniteResponsableUnite();
			case SchemaPackage.TYPE_CELLULE_SOUTIEN__APOUR_ACTIVITE_PRINCIPALE_ACTION:
				return getAPourActivitePrincipaleAction();
			case SchemaPackage.TYPE_CELLULE_SOUTIEN__APOUR_ACTIVITE_SECONDAIRE_ACTION:
				return getAPourActiviteSecondaireAction();
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
			case SchemaPackage.TYPE_CELLULE_SOUTIEN__DESCRIPTION_MISSION:
				setDescriptionMission((String)newValue);
				return;
			case SchemaPackage.TYPE_CELLULE_SOUTIEN__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_CELLULE_SOUTIEN__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_CELLULE_SOUTIEN__APOUR_UNITE_RESPONSABLE_UNITE:
				setAPourUniteResponsableUnite((TypeAssociationEXT)newValue);
				return;
			case SchemaPackage.TYPE_CELLULE_SOUTIEN__APOUR_ACTIVITE_PRINCIPALE_ACTION:
				getAPourActivitePrincipaleAction().clear();
				getAPourActivitePrincipaleAction().addAll((Collection<? extends TypeAssociation>)newValue);
				return;
			case SchemaPackage.TYPE_CELLULE_SOUTIEN__APOUR_ACTIVITE_SECONDAIRE_ACTION:
				getAPourActiviteSecondaireAction().clear();
				getAPourActiviteSecondaireAction().addAll((Collection<? extends TypeAssociation>)newValue);
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
			case SchemaPackage.TYPE_CELLULE_SOUTIEN__DESCRIPTION_MISSION:
				setDescriptionMission(DESCRIPTION_MISSION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CELLULE_SOUTIEN__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CELLULE_SOUTIEN__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CELLULE_SOUTIEN__APOUR_UNITE_RESPONSABLE_UNITE:
				setAPourUniteResponsableUnite((TypeAssociationEXT)null);
				return;
			case SchemaPackage.TYPE_CELLULE_SOUTIEN__APOUR_ACTIVITE_PRINCIPALE_ACTION:
				getAPourActivitePrincipaleAction().clear();
				return;
			case SchemaPackage.TYPE_CELLULE_SOUTIEN__APOUR_ACTIVITE_SECONDAIRE_ACTION:
				getAPourActiviteSecondaireAction().clear();
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
			case SchemaPackage.TYPE_CELLULE_SOUTIEN__DESCRIPTION_MISSION:
				return DESCRIPTION_MISSION_EDEFAULT == null ? descriptionMission != null : !DESCRIPTION_MISSION_EDEFAULT.equals(descriptionMission);
			case SchemaPackage.TYPE_CELLULE_SOUTIEN__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_CELLULE_SOUTIEN__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_CELLULE_SOUTIEN__APOUR_UNITE_RESPONSABLE_UNITE:
				return aPourUniteResponsableUnite != null;
			case SchemaPackage.TYPE_CELLULE_SOUTIEN__APOUR_ACTIVITE_PRINCIPALE_ACTION:
				return aPourActivitePrincipaleAction != null && !aPourActivitePrincipaleAction.isEmpty();
			case SchemaPackage.TYPE_CELLULE_SOUTIEN__APOUR_ACTIVITE_SECONDAIRE_ACTION:
				return aPourActiviteSecondaireAction != null && !aPourActiviteSecondaireAction.isEmpty();
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
		result.append(" (descriptionMission: ");
		result.append(descriptionMission);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeCelluleSoutienImpl
