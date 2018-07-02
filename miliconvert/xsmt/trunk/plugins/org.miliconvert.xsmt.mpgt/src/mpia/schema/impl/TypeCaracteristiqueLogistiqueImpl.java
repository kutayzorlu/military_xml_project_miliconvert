/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCaracteristiqueLogistique;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Caracteristique Logistique</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueLogistiqueImpl#isTransportParAir <em>Transport Par Air</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueLogistiqueImpl#isTransportParPipeline <em>Transport Par Pipeline</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueLogistiqueImpl#isTransportParRoute <em>Transport Par Route</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueLogistiqueImpl#getCodeLocalisation <em>Code Localisation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueLogistiqueImpl#isTransportParMer <em>Transport Par Mer</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueLogistiqueImpl#isTransportParRail <em>Transport Par Rail</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCaracteristiqueLogistiqueImpl#isTransportParVoieFluviale <em>Transport Par Voie Fluviale</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCaracteristiqueLogistiqueImpl extends TypeRacineOperationnelleImpl implements TypeCaracteristiqueLogistique {
	/**
	 * The default value of the '{@link #isTransportParAir() <em>Transport Par Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransportParAir()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSPORT_PAR_AIR_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransportParAir() <em>Transport Par Air</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransportParAir()
	 * @generated
	 * @ordered
	 */
	protected boolean transportParAir = TRANSPORT_PAR_AIR_EDEFAULT;

	/**
	 * This is true if the Transport Par Air attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transportParAirESet;

	/**
	 * The default value of the '{@link #isTransportParPipeline() <em>Transport Par Pipeline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransportParPipeline()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSPORT_PAR_PIPELINE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransportParPipeline() <em>Transport Par Pipeline</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransportParPipeline()
	 * @generated
	 * @ordered
	 */
	protected boolean transportParPipeline = TRANSPORT_PAR_PIPELINE_EDEFAULT;

	/**
	 * This is true if the Transport Par Pipeline attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transportParPipelineESet;

	/**
	 * The default value of the '{@link #isTransportParRoute() <em>Transport Par Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransportParRoute()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSPORT_PAR_ROUTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransportParRoute() <em>Transport Par Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransportParRoute()
	 * @generated
	 * @ordered
	 */
	protected boolean transportParRoute = TRANSPORT_PAR_ROUTE_EDEFAULT;

	/**
	 * This is true if the Transport Par Route attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transportParRouteESet;

	/**
	 * The default value of the '{@link #getCodeLocalisation() <em>Code Localisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeLocalisation()
	 * @generated
	 * @ordered
	 */
	protected static final String CODE_LOCALISATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodeLocalisation() <em>Code Localisation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodeLocalisation()
	 * @generated
	 * @ordered
	 */
	protected String codeLocalisation = CODE_LOCALISATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isTransportParMer() <em>Transport Par Mer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransportParMer()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSPORT_PAR_MER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransportParMer() <em>Transport Par Mer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransportParMer()
	 * @generated
	 * @ordered
	 */
	protected boolean transportParMer = TRANSPORT_PAR_MER_EDEFAULT;

	/**
	 * This is true if the Transport Par Mer attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transportParMerESet;

	/**
	 * The default value of the '{@link #isTransportParRail() <em>Transport Par Rail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransportParRail()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSPORT_PAR_RAIL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransportParRail() <em>Transport Par Rail</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransportParRail()
	 * @generated
	 * @ordered
	 */
	protected boolean transportParRail = TRANSPORT_PAR_RAIL_EDEFAULT;

	/**
	 * This is true if the Transport Par Rail attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transportParRailESet;

	/**
	 * The default value of the '{@link #isTransportParVoieFluviale() <em>Transport Par Voie Fluviale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransportParVoieFluviale()
	 * @generated
	 * @ordered
	 */
	protected static final boolean TRANSPORT_PAR_VOIE_FLUVIALE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isTransportParVoieFluviale() <em>Transport Par Voie Fluviale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isTransportParVoieFluviale()
	 * @generated
	 * @ordered
	 */
	protected boolean transportParVoieFluviale = TRANSPORT_PAR_VOIE_FLUVIALE_EDEFAULT;

	/**
	 * This is true if the Transport Par Voie Fluviale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean transportParVoieFluvialeESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCaracteristiqueLogistiqueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCaracteristiqueLogistique();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransportParAir() {
		return transportParAir;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportParAir(boolean newTransportParAir) {
		boolean oldTransportParAir = transportParAir;
		transportParAir = newTransportParAir;
		boolean oldTransportParAirESet = transportParAirESet;
		transportParAirESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_AIR, oldTransportParAir, transportParAir, !oldTransportParAirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransportParAir() {
		boolean oldTransportParAir = transportParAir;
		boolean oldTransportParAirESet = transportParAirESet;
		transportParAir = TRANSPORT_PAR_AIR_EDEFAULT;
		transportParAirESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_AIR, oldTransportParAir, TRANSPORT_PAR_AIR_EDEFAULT, oldTransportParAirESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransportParAir() {
		return transportParAirESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransportParPipeline() {
		return transportParPipeline;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportParPipeline(boolean newTransportParPipeline) {
		boolean oldTransportParPipeline = transportParPipeline;
		transportParPipeline = newTransportParPipeline;
		boolean oldTransportParPipelineESet = transportParPipelineESet;
		transportParPipelineESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_PIPELINE, oldTransportParPipeline, transportParPipeline, !oldTransportParPipelineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransportParPipeline() {
		boolean oldTransportParPipeline = transportParPipeline;
		boolean oldTransportParPipelineESet = transportParPipelineESet;
		transportParPipeline = TRANSPORT_PAR_PIPELINE_EDEFAULT;
		transportParPipelineESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_PIPELINE, oldTransportParPipeline, TRANSPORT_PAR_PIPELINE_EDEFAULT, oldTransportParPipelineESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransportParPipeline() {
		return transportParPipelineESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransportParRoute() {
		return transportParRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportParRoute(boolean newTransportParRoute) {
		boolean oldTransportParRoute = transportParRoute;
		transportParRoute = newTransportParRoute;
		boolean oldTransportParRouteESet = transportParRouteESet;
		transportParRouteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_ROUTE, oldTransportParRoute, transportParRoute, !oldTransportParRouteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransportParRoute() {
		boolean oldTransportParRoute = transportParRoute;
		boolean oldTransportParRouteESet = transportParRouteESet;
		transportParRoute = TRANSPORT_PAR_ROUTE_EDEFAULT;
		transportParRouteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_ROUTE, oldTransportParRoute, TRANSPORT_PAR_ROUTE_EDEFAULT, oldTransportParRouteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransportParRoute() {
		return transportParRouteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCodeLocalisation() {
		return codeLocalisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodeLocalisation(String newCodeLocalisation) {
		String oldCodeLocalisation = codeLocalisation;
		codeLocalisation = newCodeLocalisation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__CODE_LOCALISATION, oldCodeLocalisation, codeLocalisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransportParMer() {
		return transportParMer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportParMer(boolean newTransportParMer) {
		boolean oldTransportParMer = transportParMer;
		transportParMer = newTransportParMer;
		boolean oldTransportParMerESet = transportParMerESet;
		transportParMerESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_MER, oldTransportParMer, transportParMer, !oldTransportParMerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransportParMer() {
		boolean oldTransportParMer = transportParMer;
		boolean oldTransportParMerESet = transportParMerESet;
		transportParMer = TRANSPORT_PAR_MER_EDEFAULT;
		transportParMerESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_MER, oldTransportParMer, TRANSPORT_PAR_MER_EDEFAULT, oldTransportParMerESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransportParMer() {
		return transportParMerESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransportParRail() {
		return transportParRail;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportParRail(boolean newTransportParRail) {
		boolean oldTransportParRail = transportParRail;
		transportParRail = newTransportParRail;
		boolean oldTransportParRailESet = transportParRailESet;
		transportParRailESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_RAIL, oldTransportParRail, transportParRail, !oldTransportParRailESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransportParRail() {
		boolean oldTransportParRail = transportParRail;
		boolean oldTransportParRailESet = transportParRailESet;
		transportParRail = TRANSPORT_PAR_RAIL_EDEFAULT;
		transportParRailESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_RAIL, oldTransportParRail, TRANSPORT_PAR_RAIL_EDEFAULT, oldTransportParRailESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransportParRail() {
		return transportParRailESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isTransportParVoieFluviale() {
		return transportParVoieFluviale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransportParVoieFluviale(boolean newTransportParVoieFluviale) {
		boolean oldTransportParVoieFluviale = transportParVoieFluviale;
		transportParVoieFluviale = newTransportParVoieFluviale;
		boolean oldTransportParVoieFluvialeESet = transportParVoieFluvialeESet;
		transportParVoieFluvialeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_VOIE_FLUVIALE, oldTransportParVoieFluviale, transportParVoieFluviale, !oldTransportParVoieFluvialeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTransportParVoieFluviale() {
		boolean oldTransportParVoieFluviale = transportParVoieFluviale;
		boolean oldTransportParVoieFluvialeESet = transportParVoieFluvialeESet;
		transportParVoieFluviale = TRANSPORT_PAR_VOIE_FLUVIALE_EDEFAULT;
		transportParVoieFluvialeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_VOIE_FLUVIALE, oldTransportParVoieFluviale, TRANSPORT_PAR_VOIE_FLUVIALE_EDEFAULT, oldTransportParVoieFluvialeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTransportParVoieFluviale() {
		return transportParVoieFluvialeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_AIR:
				return isTransportParAir() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_PIPELINE:
				return isTransportParPipeline() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_ROUTE:
				return isTransportParRoute() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__CODE_LOCALISATION:
				return getCodeLocalisation();
			case SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_MER:
				return isTransportParMer() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_RAIL:
				return isTransportParRail() ? Boolean.TRUE : Boolean.FALSE;
			case SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_VOIE_FLUVIALE:
				return isTransportParVoieFluviale() ? Boolean.TRUE : Boolean.FALSE;
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
			case SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_AIR:
				setTransportParAir(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_PIPELINE:
				setTransportParPipeline(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_ROUTE:
				setTransportParRoute(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__CODE_LOCALISATION:
				setCodeLocalisation((String)newValue);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_MER:
				setTransportParMer(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_RAIL:
				setTransportParRail(((Boolean)newValue).booleanValue());
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_VOIE_FLUVIALE:
				setTransportParVoieFluviale(((Boolean)newValue).booleanValue());
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
			case SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_AIR:
				unsetTransportParAir();
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_PIPELINE:
				unsetTransportParPipeline();
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_ROUTE:
				unsetTransportParRoute();
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__CODE_LOCALISATION:
				setCodeLocalisation(CODE_LOCALISATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_MER:
				unsetTransportParMer();
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_RAIL:
				unsetTransportParRail();
				return;
			case SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_VOIE_FLUVIALE:
				unsetTransportParVoieFluviale();
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
			case SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_AIR:
				return isSetTransportParAir();
			case SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_PIPELINE:
				return isSetTransportParPipeline();
			case SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_ROUTE:
				return isSetTransportParRoute();
			case SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__CODE_LOCALISATION:
				return CODE_LOCALISATION_EDEFAULT == null ? codeLocalisation != null : !CODE_LOCALISATION_EDEFAULT.equals(codeLocalisation);
			case SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_MER:
				return isSetTransportParMer();
			case SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_RAIL:
				return isSetTransportParRail();
			case SchemaPackage.TYPE_CARACTERISTIQUE_LOGISTIQUE__TRANSPORT_PAR_VOIE_FLUVIALE:
				return isSetTransportParVoieFluviale();
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
		result.append(" (transportParAir: ");
		if (transportParAirESet) result.append(transportParAir); else result.append("<unset>");
		result.append(", transportParPipeline: ");
		if (transportParPipelineESet) result.append(transportParPipeline); else result.append("<unset>");
		result.append(", transportParRoute: ");
		if (transportParRouteESet) result.append(transportParRoute); else result.append("<unset>");
		result.append(", codeLocalisation: ");
		result.append(codeLocalisation);
		result.append(", transportParMer: ");
		if (transportParMerESet) result.append(transportParMer); else result.append("<unset>");
		result.append(", transportParRail: ");
		if (transportParRailESet) result.append(transportParRail); else result.append("<unset>");
		result.append(", transportParVoieFluviale: ");
		if (transportParVoieFluvialeESet) result.append(transportParVoieFluviale); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeCaracteristiqueLogistiqueImpl
