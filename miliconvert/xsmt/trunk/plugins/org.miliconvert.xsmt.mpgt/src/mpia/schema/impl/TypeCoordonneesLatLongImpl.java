/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypeLatitude;
import mpia.meta.TypeDataTypeLongitude;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCoordonneesLatLong;
import mpia.schema.TypeDictionaryDicoPrecisionAngle;
import mpia.schema.TypeDictionaryDicoPrecisionDistance;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Coordonnees Lat Long</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeCoordonneesLatLongImpl#getLatitude <em>Latitude</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCoordonneesLatLongImpl#getLongitude <em>Longitude</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCoordonneesLatLongImpl#getValeurDistanceVerticale <em>Valeur Distance Verticale</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCoordonneesLatLongImpl#getPrecisionLatitude <em>Precision Latitude</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCoordonneesLatLongImpl#getPrecisionLongitude <em>Precision Longitude</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeCoordonneesLatLongImpl#getPrecisionDistanceVerticale <em>Precision Distance Verticale</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeCoordonneesLatLongImpl extends EObjectImpl implements TypeCoordonneesLatLong {
	/**
	 * The cached value of the '{@link #getLatitude() <em>Latitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLatitude()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLatitude latitude;

	/**
	 * The cached value of the '{@link #getLongitude() <em>Longitude</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongitude()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongitude longitude;

	/**
	 * The default value of the '{@link #getValeurDistanceVerticale() <em>Valeur Distance Verticale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeurDistanceVerticale()
	 * @generated
	 * @ordered
	 */
	protected static final double VALEUR_DISTANCE_VERTICALE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getValeurDistanceVerticale() <em>Valeur Distance Verticale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValeurDistanceVerticale()
	 * @generated
	 * @ordered
	 */
	protected double valeurDistanceVerticale = VALEUR_DISTANCE_VERTICALE_EDEFAULT;

	/**
	 * This is true if the Valeur Distance Verticale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean valeurDistanceVerticaleESet;

	/**
	 * The default value of the '{@link #getPrecisionLatitude() <em>Precision Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionLatitude()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPrecisionAngle PRECISION_LATITUDE_EDEFAULT = TypeDictionaryDicoPrecisionAngle._1000MN;

	/**
	 * The cached value of the '{@link #getPrecisionLatitude() <em>Precision Latitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionLatitude()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPrecisionAngle precisionLatitude = PRECISION_LATITUDE_EDEFAULT;

	/**
	 * This is true if the Precision Latitude attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean precisionLatitudeESet;

	/**
	 * The default value of the '{@link #getPrecisionLongitude() <em>Precision Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionLongitude()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPrecisionAngle PRECISION_LONGITUDE_EDEFAULT = TypeDictionaryDicoPrecisionAngle._1000MN;

	/**
	 * The cached value of the '{@link #getPrecisionLongitude() <em>Precision Longitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionLongitude()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPrecisionAngle precisionLongitude = PRECISION_LONGITUDE_EDEFAULT;

	/**
	 * This is true if the Precision Longitude attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean precisionLongitudeESet;

	/**
	 * The default value of the '{@link #getPrecisionDistanceVerticale() <em>Precision Distance Verticale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionDistanceVerticale()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoPrecisionDistance PRECISION_DISTANCE_VERTICALE_EDEFAULT = TypeDictionaryDicoPrecisionDistance._10FT;

	/**
	 * The cached value of the '{@link #getPrecisionDistanceVerticale() <em>Precision Distance Verticale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrecisionDistanceVerticale()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoPrecisionDistance precisionDistanceVerticale = PRECISION_DISTANCE_VERTICALE_EDEFAULT;

	/**
	 * This is true if the Precision Distance Verticale attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean precisionDistanceVerticaleESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeCoordonneesLatLongImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeCoordonneesLatLong();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLatitude getLatitude() {
		return latitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLatitude(TypeDataTypeLatitude newLatitude, NotificationChain msgs) {
		TypeDataTypeLatitude oldLatitude = latitude;
		latitude = newLatitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COORDONNEES_LAT_LONG__LATITUDE, oldLatitude, newLatitude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLatitude(TypeDataTypeLatitude newLatitude) {
		if (newLatitude != latitude) {
			NotificationChain msgs = null;
			if (latitude != null)
				msgs = ((InternalEObject)latitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COORDONNEES_LAT_LONG__LATITUDE, null, msgs);
			if (newLatitude != null)
				msgs = ((InternalEObject)newLatitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COORDONNEES_LAT_LONG__LATITUDE, null, msgs);
			msgs = basicSetLatitude(newLatitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COORDONNEES_LAT_LONG__LATITUDE, newLatitude, newLatitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongitude getLongitude() {
		return longitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLongitude(TypeDataTypeLongitude newLongitude, NotificationChain msgs) {
		TypeDataTypeLongitude oldLongitude = longitude;
		longitude = newLongitude;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COORDONNEES_LAT_LONG__LONGITUDE, oldLongitude, newLongitude);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongitude(TypeDataTypeLongitude newLongitude) {
		if (newLongitude != longitude) {
			NotificationChain msgs = null;
			if (longitude != null)
				msgs = ((InternalEObject)longitude).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COORDONNEES_LAT_LONG__LONGITUDE, null, msgs);
			if (newLongitude != null)
				msgs = ((InternalEObject)newLongitude).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_COORDONNEES_LAT_LONG__LONGITUDE, null, msgs);
			msgs = basicSetLongitude(newLongitude, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COORDONNEES_LAT_LONG__LONGITUDE, newLongitude, newLongitude));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getValeurDistanceVerticale() {
		return valeurDistanceVerticale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValeurDistanceVerticale(double newValeurDistanceVerticale) {
		double oldValeurDistanceVerticale = valeurDistanceVerticale;
		valeurDistanceVerticale = newValeurDistanceVerticale;
		boolean oldValeurDistanceVerticaleESet = valeurDistanceVerticaleESet;
		valeurDistanceVerticaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COORDONNEES_LAT_LONG__VALEUR_DISTANCE_VERTICALE, oldValeurDistanceVerticale, valeurDistanceVerticale, !oldValeurDistanceVerticaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetValeurDistanceVerticale() {
		double oldValeurDistanceVerticale = valeurDistanceVerticale;
		boolean oldValeurDistanceVerticaleESet = valeurDistanceVerticaleESet;
		valeurDistanceVerticale = VALEUR_DISTANCE_VERTICALE_EDEFAULT;
		valeurDistanceVerticaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COORDONNEES_LAT_LONG__VALEUR_DISTANCE_VERTICALE, oldValeurDistanceVerticale, VALEUR_DISTANCE_VERTICALE_EDEFAULT, oldValeurDistanceVerticaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValeurDistanceVerticale() {
		return valeurDistanceVerticaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPrecisionAngle getPrecisionLatitude() {
		return precisionLatitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecisionLatitude(TypeDictionaryDicoPrecisionAngle newPrecisionLatitude) {
		TypeDictionaryDicoPrecisionAngle oldPrecisionLatitude = precisionLatitude;
		precisionLatitude = newPrecisionLatitude == null ? PRECISION_LATITUDE_EDEFAULT : newPrecisionLatitude;
		boolean oldPrecisionLatitudeESet = precisionLatitudeESet;
		precisionLatitudeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COORDONNEES_LAT_LONG__PRECISION_LATITUDE, oldPrecisionLatitude, precisionLatitude, !oldPrecisionLatitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrecisionLatitude() {
		TypeDictionaryDicoPrecisionAngle oldPrecisionLatitude = precisionLatitude;
		boolean oldPrecisionLatitudeESet = precisionLatitudeESet;
		precisionLatitude = PRECISION_LATITUDE_EDEFAULT;
		precisionLatitudeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COORDONNEES_LAT_LONG__PRECISION_LATITUDE, oldPrecisionLatitude, PRECISION_LATITUDE_EDEFAULT, oldPrecisionLatitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrecisionLatitude() {
		return precisionLatitudeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPrecisionAngle getPrecisionLongitude() {
		return precisionLongitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecisionLongitude(TypeDictionaryDicoPrecisionAngle newPrecisionLongitude) {
		TypeDictionaryDicoPrecisionAngle oldPrecisionLongitude = precisionLongitude;
		precisionLongitude = newPrecisionLongitude == null ? PRECISION_LONGITUDE_EDEFAULT : newPrecisionLongitude;
		boolean oldPrecisionLongitudeESet = precisionLongitudeESet;
		precisionLongitudeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COORDONNEES_LAT_LONG__PRECISION_LONGITUDE, oldPrecisionLongitude, precisionLongitude, !oldPrecisionLongitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrecisionLongitude() {
		TypeDictionaryDicoPrecisionAngle oldPrecisionLongitude = precisionLongitude;
		boolean oldPrecisionLongitudeESet = precisionLongitudeESet;
		precisionLongitude = PRECISION_LONGITUDE_EDEFAULT;
		precisionLongitudeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COORDONNEES_LAT_LONG__PRECISION_LONGITUDE, oldPrecisionLongitude, PRECISION_LONGITUDE_EDEFAULT, oldPrecisionLongitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrecisionLongitude() {
		return precisionLongitudeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoPrecisionDistance getPrecisionDistanceVerticale() {
		return precisionDistanceVerticale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrecisionDistanceVerticale(TypeDictionaryDicoPrecisionDistance newPrecisionDistanceVerticale) {
		TypeDictionaryDicoPrecisionDistance oldPrecisionDistanceVerticale = precisionDistanceVerticale;
		precisionDistanceVerticale = newPrecisionDistanceVerticale == null ? PRECISION_DISTANCE_VERTICALE_EDEFAULT : newPrecisionDistanceVerticale;
		boolean oldPrecisionDistanceVerticaleESet = precisionDistanceVerticaleESet;
		precisionDistanceVerticaleESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_COORDONNEES_LAT_LONG__PRECISION_DISTANCE_VERTICALE, oldPrecisionDistanceVerticale, precisionDistanceVerticale, !oldPrecisionDistanceVerticaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetPrecisionDistanceVerticale() {
		TypeDictionaryDicoPrecisionDistance oldPrecisionDistanceVerticale = precisionDistanceVerticale;
		boolean oldPrecisionDistanceVerticaleESet = precisionDistanceVerticaleESet;
		precisionDistanceVerticale = PRECISION_DISTANCE_VERTICALE_EDEFAULT;
		precisionDistanceVerticaleESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_COORDONNEES_LAT_LONG__PRECISION_DISTANCE_VERTICALE, oldPrecisionDistanceVerticale, PRECISION_DISTANCE_VERTICALE_EDEFAULT, oldPrecisionDistanceVerticaleESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPrecisionDistanceVerticale() {
		return precisionDistanceVerticaleESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_COORDONNEES_LAT_LONG__LATITUDE:
				return basicSetLatitude(null, msgs);
			case SchemaPackage.TYPE_COORDONNEES_LAT_LONG__LONGITUDE:
				return basicSetLongitude(null, msgs);
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
			case SchemaPackage.TYPE_COORDONNEES_LAT_LONG__LATITUDE:
				return getLatitude();
			case SchemaPackage.TYPE_COORDONNEES_LAT_LONG__LONGITUDE:
				return getLongitude();
			case SchemaPackage.TYPE_COORDONNEES_LAT_LONG__VALEUR_DISTANCE_VERTICALE:
				return new Double(getValeurDistanceVerticale());
			case SchemaPackage.TYPE_COORDONNEES_LAT_LONG__PRECISION_LATITUDE:
				return getPrecisionLatitude();
			case SchemaPackage.TYPE_COORDONNEES_LAT_LONG__PRECISION_LONGITUDE:
				return getPrecisionLongitude();
			case SchemaPackage.TYPE_COORDONNEES_LAT_LONG__PRECISION_DISTANCE_VERTICALE:
				return getPrecisionDistanceVerticale();
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
			case SchemaPackage.TYPE_COORDONNEES_LAT_LONG__LATITUDE:
				setLatitude((TypeDataTypeLatitude)newValue);
				return;
			case SchemaPackage.TYPE_COORDONNEES_LAT_LONG__LONGITUDE:
				setLongitude((TypeDataTypeLongitude)newValue);
				return;
			case SchemaPackage.TYPE_COORDONNEES_LAT_LONG__VALEUR_DISTANCE_VERTICALE:
				setValeurDistanceVerticale(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_COORDONNEES_LAT_LONG__PRECISION_LATITUDE:
				setPrecisionLatitude((TypeDictionaryDicoPrecisionAngle)newValue);
				return;
			case SchemaPackage.TYPE_COORDONNEES_LAT_LONG__PRECISION_LONGITUDE:
				setPrecisionLongitude((TypeDictionaryDicoPrecisionAngle)newValue);
				return;
			case SchemaPackage.TYPE_COORDONNEES_LAT_LONG__PRECISION_DISTANCE_VERTICALE:
				setPrecisionDistanceVerticale((TypeDictionaryDicoPrecisionDistance)newValue);
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
			case SchemaPackage.TYPE_COORDONNEES_LAT_LONG__LATITUDE:
				setLatitude((TypeDataTypeLatitude)null);
				return;
			case SchemaPackage.TYPE_COORDONNEES_LAT_LONG__LONGITUDE:
				setLongitude((TypeDataTypeLongitude)null);
				return;
			case SchemaPackage.TYPE_COORDONNEES_LAT_LONG__VALEUR_DISTANCE_VERTICALE:
				unsetValeurDistanceVerticale();
				return;
			case SchemaPackage.TYPE_COORDONNEES_LAT_LONG__PRECISION_LATITUDE:
				unsetPrecisionLatitude();
				return;
			case SchemaPackage.TYPE_COORDONNEES_LAT_LONG__PRECISION_LONGITUDE:
				unsetPrecisionLongitude();
				return;
			case SchemaPackage.TYPE_COORDONNEES_LAT_LONG__PRECISION_DISTANCE_VERTICALE:
				unsetPrecisionDistanceVerticale();
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
			case SchemaPackage.TYPE_COORDONNEES_LAT_LONG__LATITUDE:
				return latitude != null;
			case SchemaPackage.TYPE_COORDONNEES_LAT_LONG__LONGITUDE:
				return longitude != null;
			case SchemaPackage.TYPE_COORDONNEES_LAT_LONG__VALEUR_DISTANCE_VERTICALE:
				return isSetValeurDistanceVerticale();
			case SchemaPackage.TYPE_COORDONNEES_LAT_LONG__PRECISION_LATITUDE:
				return isSetPrecisionLatitude();
			case SchemaPackage.TYPE_COORDONNEES_LAT_LONG__PRECISION_LONGITUDE:
				return isSetPrecisionLongitude();
			case SchemaPackage.TYPE_COORDONNEES_LAT_LONG__PRECISION_DISTANCE_VERTICALE:
				return isSetPrecisionDistanceVerticale();
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
		result.append(" (valeurDistanceVerticale: ");
		if (valeurDistanceVerticaleESet) result.append(valeurDistanceVerticale); else result.append("<unset>");
		result.append(", precisionLatitude: ");
		if (precisionLatitudeESet) result.append(precisionLatitude); else result.append("<unset>");
		result.append(", precisionLongitude: ");
		if (precisionLongitudeESet) result.append(precisionLongitude); else result.append("<unset>");
		result.append(", precisionDistanceVerticale: ");
		if (precisionDistanceVerticaleESet) result.append(precisionDistanceVerticale); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeCoordonneesLatLongImpl
