/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeAssociation;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeMissionAppuiMobilite;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Mission Appui Mobilite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMissionAppuiMobiliteImpl#getCoupureSecheOuHumide <em>Coupure Seche Ou Humide</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAppuiMobiliteImpl#getFranchissementAPrevoir <em>Franchissement APrevoir</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAppuiMobiliteImpl#getRetablissementItineraire <em>Retablissement Itineraire</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAppuiMobiliteImpl#getCTE <em>CTE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAppuiMobiliteImpl#getCE <em>CE</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMissionAppuiMobiliteImpl#getAPourZoneAFranchirObstacle <em>APour Zone AFranchir Obstacle</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMissionAppuiMobiliteImpl extends EObjectImpl implements TypeMissionAppuiMobilite {
	/**
	 * The default value of the '{@link #getCoupureSecheOuHumide() <em>Coupure Seche Ou Humide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoupureSecheOuHumide()
	 * @generated
	 * @ordered
	 */
	protected static final String COUPURE_SECHE_OU_HUMIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoupureSecheOuHumide() <em>Coupure Seche Ou Humide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoupureSecheOuHumide()
	 * @generated
	 * @ordered
	 */
	protected String coupureSecheOuHumide = COUPURE_SECHE_OU_HUMIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFranchissementAPrevoir() <em>Franchissement APrevoir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFranchissementAPrevoir()
	 * @generated
	 * @ordered
	 */
	protected static final String FRANCHISSEMENT_APREVOIR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFranchissementAPrevoir() <em>Franchissement APrevoir</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFranchissementAPrevoir()
	 * @generated
	 * @ordered
	 */
	protected String franchissementAPrevoir = FRANCHISSEMENT_APREVOIR_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetablissementItineraire() <em>Retablissement Itineraire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetablissementItineraire()
	 * @generated
	 * @ordered
	 */
	protected static final String RETABLISSEMENT_ITINERAIRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRetablissementItineraire() <em>Retablissement Itineraire</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetablissementItineraire()
	 * @generated
	 * @ordered
	 */
	protected String retablissementItineraire = RETABLISSEMENT_ITINERAIRE_EDEFAULT;

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
	 * The cached value of the '{@link #getAPourZoneAFranchirObstacle() <em>APour Zone AFranchir Obstacle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourZoneAFranchirObstacle()
	 * @generated
	 * @ordered
	 */
	protected TypeAssociation aPourZoneAFranchirObstacle;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMissionAppuiMobiliteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMissionAppuiMobilite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCoupureSecheOuHumide() {
		return coupureSecheOuHumide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoupureSecheOuHumide(String newCoupureSecheOuHumide) {
		String oldCoupureSecheOuHumide = coupureSecheOuHumide;
		coupureSecheOuHumide = newCoupureSecheOuHumide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__COUPURE_SECHE_OU_HUMIDE, oldCoupureSecheOuHumide, coupureSecheOuHumide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFranchissementAPrevoir() {
		return franchissementAPrevoir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFranchissementAPrevoir(String newFranchissementAPrevoir) {
		String oldFranchissementAPrevoir = franchissementAPrevoir;
		franchissementAPrevoir = newFranchissementAPrevoir;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__FRANCHISSEMENT_APREVOIR, oldFranchissementAPrevoir, franchissementAPrevoir));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRetablissementItineraire() {
		return retablissementItineraire;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetablissementItineraire(String newRetablissementItineraire) {
		String oldRetablissementItineraire = retablissementItineraire;
		retablissementItineraire = newRetablissementItineraire;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__RETABLISSEMENT_ITINERAIRE, oldRetablissementItineraire, retablissementItineraire));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__CTE, oldCTE, cTE));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__CE, oldCE, cE));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeAssociation getAPourZoneAFranchirObstacle() {
		return aPourZoneAFranchirObstacle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourZoneAFranchirObstacle(TypeAssociation newAPourZoneAFranchirObstacle, NotificationChain msgs) {
		TypeAssociation oldAPourZoneAFranchirObstacle = aPourZoneAFranchirObstacle;
		aPourZoneAFranchirObstacle = newAPourZoneAFranchirObstacle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__APOUR_ZONE_AFRANCHIR_OBSTACLE, oldAPourZoneAFranchirObstacle, newAPourZoneAFranchirObstacle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourZoneAFranchirObstacle(TypeAssociation newAPourZoneAFranchirObstacle) {
		if (newAPourZoneAFranchirObstacle != aPourZoneAFranchirObstacle) {
			NotificationChain msgs = null;
			if (aPourZoneAFranchirObstacle != null)
				msgs = ((InternalEObject)aPourZoneAFranchirObstacle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__APOUR_ZONE_AFRANCHIR_OBSTACLE, null, msgs);
			if (newAPourZoneAFranchirObstacle != null)
				msgs = ((InternalEObject)newAPourZoneAFranchirObstacle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__APOUR_ZONE_AFRANCHIR_OBSTACLE, null, msgs);
			msgs = basicSetAPourZoneAFranchirObstacle(newAPourZoneAFranchirObstacle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__APOUR_ZONE_AFRANCHIR_OBSTACLE, newAPourZoneAFranchirObstacle, newAPourZoneAFranchirObstacle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__APOUR_ZONE_AFRANCHIR_OBSTACLE:
				return basicSetAPourZoneAFranchirObstacle(null, msgs);
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
			case SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__COUPURE_SECHE_OU_HUMIDE:
				return getCoupureSecheOuHumide();
			case SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__FRANCHISSEMENT_APREVOIR:
				return getFranchissementAPrevoir();
			case SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__RETABLISSEMENT_ITINERAIRE:
				return getRetablissementItineraire();
			case SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__CTE:
				return getCTE();
			case SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__CE:
				return getCE();
			case SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__APOUR_ZONE_AFRANCHIR_OBSTACLE:
				return getAPourZoneAFranchirObstacle();
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
			case SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__COUPURE_SECHE_OU_HUMIDE:
				setCoupureSecheOuHumide((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__FRANCHISSEMENT_APREVOIR:
				setFranchissementAPrevoir((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__RETABLISSEMENT_ITINERAIRE:
				setRetablissementItineraire((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__CTE:
				setCTE((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__CE:
				setCE((String)newValue);
				return;
			case SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__APOUR_ZONE_AFRANCHIR_OBSTACLE:
				setAPourZoneAFranchirObstacle((TypeAssociation)newValue);
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
			case SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__COUPURE_SECHE_OU_HUMIDE:
				setCoupureSecheOuHumide(COUPURE_SECHE_OU_HUMIDE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__FRANCHISSEMENT_APREVOIR:
				setFranchissementAPrevoir(FRANCHISSEMENT_APREVOIR_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__RETABLISSEMENT_ITINERAIRE:
				setRetablissementItineraire(RETABLISSEMENT_ITINERAIRE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__CTE:
				setCTE(CTE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__CE:
				setCE(CE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__APOUR_ZONE_AFRANCHIR_OBSTACLE:
				setAPourZoneAFranchirObstacle((TypeAssociation)null);
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
			case SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__COUPURE_SECHE_OU_HUMIDE:
				return COUPURE_SECHE_OU_HUMIDE_EDEFAULT == null ? coupureSecheOuHumide != null : !COUPURE_SECHE_OU_HUMIDE_EDEFAULT.equals(coupureSecheOuHumide);
			case SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__FRANCHISSEMENT_APREVOIR:
				return FRANCHISSEMENT_APREVOIR_EDEFAULT == null ? franchissementAPrevoir != null : !FRANCHISSEMENT_APREVOIR_EDEFAULT.equals(franchissementAPrevoir);
			case SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__RETABLISSEMENT_ITINERAIRE:
				return RETABLISSEMENT_ITINERAIRE_EDEFAULT == null ? retablissementItineraire != null : !RETABLISSEMENT_ITINERAIRE_EDEFAULT.equals(retablissementItineraire);
			case SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__CTE:
				return CTE_EDEFAULT == null ? cTE != null : !CTE_EDEFAULT.equals(cTE);
			case SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__CE:
				return CE_EDEFAULT == null ? cE != null : !CE_EDEFAULT.equals(cE);
			case SchemaPackage.TYPE_MISSION_APPUI_MOBILITE__APOUR_ZONE_AFRANCHIR_OBSTACLE:
				return aPourZoneAFranchirObstacle != null;
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
		result.append(" (coupureSecheOuHumide: ");
		result.append(coupureSecheOuHumide);
		result.append(", franchissementAPrevoir: ");
		result.append(franchissementAPrevoir);
		result.append(", retablissementItineraire: ");
		result.append(retablissementItineraire);
		result.append(", cTE: ");
		result.append(cTE);
		result.append(", cE: ");
		result.append(cE);
		result.append(')');
		return result.toString();
	}

} //TypeMissionAppuiMobiliteImpl
