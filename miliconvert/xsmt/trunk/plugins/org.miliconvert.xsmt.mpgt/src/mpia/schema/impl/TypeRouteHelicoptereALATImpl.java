/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeVitesseLineaire;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoModaliteSens;
import mpia.schema.TypeDictionaryDicoTypeVol;
import mpia.schema.TypeRouteHelicoptereALAT;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Route Helicoptere ALAT</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeRouteHelicoptereALATImpl#getTypeRoute <em>Type Route</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRouteHelicoptereALATImpl#getSousCategorieTextuelle <em>Sous Categorie Textuelle</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRouteHelicoptereALATImpl#getMajorantDistance <em>Majorant Distance</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRouteHelicoptereALATImpl#getPenteRoute <em>Pente Route</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRouteHelicoptereALATImpl#getSensRoute <em>Sens Route</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeRouteHelicoptereALATImpl#getVitesse <em>Vitesse</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeRouteHelicoptereALATImpl extends TypeElementControleImpl implements TypeRouteHelicoptereALAT {
	/**
	 * The default value of the '{@link #getTypeRoute() <em>Type Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRoute()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoTypeVol TYPE_ROUTE_EDEFAULT = TypeDictionaryDicoTypeVol.TECFBD;

	/**
	 * The cached value of the '{@link #getTypeRoute() <em>Type Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeRoute()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoTypeVol typeRoute = TYPE_ROUTE_EDEFAULT;

	/**
	 * This is true if the Type Route attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean typeRouteESet;

	/**
	 * The default value of the '{@link #getSousCategorieTextuelle() <em>Sous Categorie Textuelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorieTextuelle()
	 * @generated
	 * @ordered
	 */
	protected static final String SOUS_CATEGORIE_TEXTUELLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSousCategorieTextuelle() <em>Sous Categorie Textuelle</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSousCategorieTextuelle()
	 * @generated
	 * @ordered
	 */
	protected String sousCategorieTextuelle = SOUS_CATEGORIE_TEXTUELLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMajorantDistance() <em>Majorant Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajorantDistance()
	 * @generated
	 * @ordered
	 */
	protected static final long MAJORANT_DISTANCE_EDEFAULT = 0L;

	/**
	 * The cached value of the '{@link #getMajorantDistance() <em>Majorant Distance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMajorantDistance()
	 * @generated
	 * @ordered
	 */
	protected long majorantDistance = MAJORANT_DISTANCE_EDEFAULT;

	/**
	 * This is true if the Majorant Distance attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean majorantDistanceESet;

	/**
	 * The cached value of the '{@link #getPenteRoute() <em>Pente Route</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPenteRoute()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle penteRoute;

	/**
	 * The default value of the '{@link #getSensRoute() <em>Sens Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensRoute()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoModaliteSens SENS_ROUTE_EDEFAULT = TypeDictionaryDicoModaliteSens.DIRCRE;

	/**
	 * The cached value of the '{@link #getSensRoute() <em>Sens Route</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSensRoute()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoModaliteSens sensRoute = SENS_ROUTE_EDEFAULT;

	/**
	 * This is true if the Sens Route attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean sensRouteESet;

	/**
	 * The cached value of the '{@link #getVitesse() <em>Vitesse</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVitesse()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeVitesseLineaire vitesse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeRouteHelicoptereALATImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeRouteHelicoptereALAT();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoTypeVol getTypeRoute() {
		return typeRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeRoute(TypeDictionaryDicoTypeVol newTypeRoute) {
		TypeDictionaryDicoTypeVol oldTypeRoute = typeRoute;
		typeRoute = newTypeRoute == null ? TYPE_ROUTE_EDEFAULT : newTypeRoute;
		boolean oldTypeRouteESet = typeRouteESet;
		typeRouteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__TYPE_ROUTE, oldTypeRoute, typeRoute, !oldTypeRouteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetTypeRoute() {
		TypeDictionaryDicoTypeVol oldTypeRoute = typeRoute;
		boolean oldTypeRouteESet = typeRouteESet;
		typeRoute = TYPE_ROUTE_EDEFAULT;
		typeRouteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__TYPE_ROUTE, oldTypeRoute, TYPE_ROUTE_EDEFAULT, oldTypeRouteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTypeRoute() {
		return typeRouteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSousCategorieTextuelle() {
		return sousCategorieTextuelle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSousCategorieTextuelle(String newSousCategorieTextuelle) {
		String oldSousCategorieTextuelle = sousCategorieTextuelle;
		sousCategorieTextuelle = newSousCategorieTextuelle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__SOUS_CATEGORIE_TEXTUELLE, oldSousCategorieTextuelle, sousCategorieTextuelle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getMajorantDistance() {
		return majorantDistance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMajorantDistance(long newMajorantDistance) {
		long oldMajorantDistance = majorantDistance;
		majorantDistance = newMajorantDistance;
		boolean oldMajorantDistanceESet = majorantDistanceESet;
		majorantDistanceESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__MAJORANT_DISTANCE, oldMajorantDistance, majorantDistance, !oldMajorantDistanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetMajorantDistance() {
		long oldMajorantDistance = majorantDistance;
		boolean oldMajorantDistanceESet = majorantDistanceESet;
		majorantDistance = MAJORANT_DISTANCE_EDEFAULT;
		majorantDistanceESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__MAJORANT_DISTANCE, oldMajorantDistance, MAJORANT_DISTANCE_EDEFAULT, oldMajorantDistanceESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMajorantDistance() {
		return majorantDistanceESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getPenteRoute() {
		return penteRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPenteRoute(TypeDataTypeAngle newPenteRoute, NotificationChain msgs) {
		TypeDataTypeAngle oldPenteRoute = penteRoute;
		penteRoute = newPenteRoute;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__PENTE_ROUTE, oldPenteRoute, newPenteRoute);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPenteRoute(TypeDataTypeAngle newPenteRoute) {
		if (newPenteRoute != penteRoute) {
			NotificationChain msgs = null;
			if (penteRoute != null)
				msgs = ((InternalEObject)penteRoute).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__PENTE_ROUTE, null, msgs);
			if (newPenteRoute != null)
				msgs = ((InternalEObject)newPenteRoute).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__PENTE_ROUTE, null, msgs);
			msgs = basicSetPenteRoute(newPenteRoute, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__PENTE_ROUTE, newPenteRoute, newPenteRoute));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoModaliteSens getSensRoute() {
		return sensRoute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSensRoute(TypeDictionaryDicoModaliteSens newSensRoute) {
		TypeDictionaryDicoModaliteSens oldSensRoute = sensRoute;
		sensRoute = newSensRoute == null ? SENS_ROUTE_EDEFAULT : newSensRoute;
		boolean oldSensRouteESet = sensRouteESet;
		sensRouteESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__SENS_ROUTE, oldSensRoute, sensRoute, !oldSensRouteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSensRoute() {
		TypeDictionaryDicoModaliteSens oldSensRoute = sensRoute;
		boolean oldSensRouteESet = sensRouteESet;
		sensRoute = SENS_ROUTE_EDEFAULT;
		sensRouteESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__SENS_ROUTE, oldSensRoute, SENS_ROUTE_EDEFAULT, oldSensRouteESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSensRoute() {
		return sensRouteESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeVitesseLineaire getVitesse() {
		return vitesse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVitesse(TypeDataTypeVitesseLineaire newVitesse, NotificationChain msgs) {
		TypeDataTypeVitesseLineaire oldVitesse = vitesse;
		vitesse = newVitesse;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__VITESSE, oldVitesse, newVitesse);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVitesse(TypeDataTypeVitesseLineaire newVitesse) {
		if (newVitesse != vitesse) {
			NotificationChain msgs = null;
			if (vitesse != null)
				msgs = ((InternalEObject)vitesse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__VITESSE, null, msgs);
			if (newVitesse != null)
				msgs = ((InternalEObject)newVitesse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__VITESSE, null, msgs);
			msgs = basicSetVitesse(newVitesse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__VITESSE, newVitesse, newVitesse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__PENTE_ROUTE:
				return basicSetPenteRoute(null, msgs);
			case SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__VITESSE:
				return basicSetVitesse(null, msgs);
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
			case SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__TYPE_ROUTE:
				return getTypeRoute();
			case SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__SOUS_CATEGORIE_TEXTUELLE:
				return getSousCategorieTextuelle();
			case SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__MAJORANT_DISTANCE:
				return new Long(getMajorantDistance());
			case SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__PENTE_ROUTE:
				return getPenteRoute();
			case SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__SENS_ROUTE:
				return getSensRoute();
			case SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__VITESSE:
				return getVitesse();
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
			case SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__TYPE_ROUTE:
				setTypeRoute((TypeDictionaryDicoTypeVol)newValue);
				return;
			case SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__SOUS_CATEGORIE_TEXTUELLE:
				setSousCategorieTextuelle((String)newValue);
				return;
			case SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__MAJORANT_DISTANCE:
				setMajorantDistance(((Long)newValue).longValue());
				return;
			case SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__PENTE_ROUTE:
				setPenteRoute((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__SENS_ROUTE:
				setSensRoute((TypeDictionaryDicoModaliteSens)newValue);
				return;
			case SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__VITESSE:
				setVitesse((TypeDataTypeVitesseLineaire)newValue);
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
			case SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__TYPE_ROUTE:
				unsetTypeRoute();
				return;
			case SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__SOUS_CATEGORIE_TEXTUELLE:
				setSousCategorieTextuelle(SOUS_CATEGORIE_TEXTUELLE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__MAJORANT_DISTANCE:
				unsetMajorantDistance();
				return;
			case SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__PENTE_ROUTE:
				setPenteRoute((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__SENS_ROUTE:
				unsetSensRoute();
				return;
			case SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__VITESSE:
				setVitesse((TypeDataTypeVitesseLineaire)null);
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
			case SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__TYPE_ROUTE:
				return isSetTypeRoute();
			case SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__SOUS_CATEGORIE_TEXTUELLE:
				return SOUS_CATEGORIE_TEXTUELLE_EDEFAULT == null ? sousCategorieTextuelle != null : !SOUS_CATEGORIE_TEXTUELLE_EDEFAULT.equals(sousCategorieTextuelle);
			case SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__MAJORANT_DISTANCE:
				return isSetMajorantDistance();
			case SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__PENTE_ROUTE:
				return penteRoute != null;
			case SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__SENS_ROUTE:
				return isSetSensRoute();
			case SchemaPackage.TYPE_ROUTE_HELICOPTERE_ALAT__VITESSE:
				return vitesse != null;
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
		result.append(" (typeRoute: ");
		if (typeRouteESet) result.append(typeRoute); else result.append("<unset>");
		result.append(", sousCategorieTextuelle: ");
		result.append(sousCategorieTextuelle);
		result.append(", majorantDistance: ");
		if (majorantDistanceESet) result.append(majorantDistance); else result.append("<unset>");
		result.append(", sensRoute: ");
		if (sensRouteESet) result.append(sensRoute); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeRouteHelicoptereALATImpl
