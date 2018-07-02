/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import mpia.meta.TypeDataTypePression;
import mpia.meta.TypeDataTypeTemperature;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeAtmosphere;
import mpia.schema.TypeDictionaryDicoAtmosphereCoucheInversion;
import mpia.schema.TypeDictionaryDicoAtmosphereGradientDetailleTemperature;
import mpia.schema.TypeDictionaryDicoAtmosphereGradientTemperature;
import mpia.schema.TypeDictionaryDicoAtmosphereSystemePression;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Atmosphere</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeAtmosphereImpl#getHumidite <em>Humidite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAtmosphereImpl#getPression <em>Pression</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAtmosphereImpl#getTemperature <em>Temperature</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAtmosphereImpl#getGradientTemperature <em>Gradient Temperature</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAtmosphereImpl#getGradientDetailleTemperature <em>Gradient Detaille Temperature</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAtmosphereImpl#getCoucheInversion <em>Couche Inversion</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeAtmosphereImpl#getSystemePression <em>Systeme Pression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeAtmosphereImpl extends EObjectImpl implements TypeAtmosphere {
	/**
	 * The default value of the '{@link #getHumidite() <em>Humidite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumidite()
	 * @generated
	 * @ordered
	 */
	protected static final double HUMIDITE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getHumidite() <em>Humidite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHumidite()
	 * @generated
	 * @ordered
	 */
	protected double humidite = HUMIDITE_EDEFAULT;

	/**
	 * This is true if the Humidite attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean humiditeESet;

	/**
	 * The cached value of the '{@link #getPression() <em>Pression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPression()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypePression pression;

	/**
	 * The cached value of the '{@link #getTemperature() <em>Temperature</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemperature()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeTemperature temperature;

	/**
	 * The default value of the '{@link #getGradientTemperature() <em>Gradient Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAtmosphereGradientTemperature GRADIENT_TEMPERATURE_EDEFAULT = TypeDictionaryDicoAtmosphereGradientTemperature.NKN;

	/**
	 * The cached value of the '{@link #getGradientTemperature() <em>Gradient Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientTemperature()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAtmosphereGradientTemperature gradientTemperature = GRADIENT_TEMPERATURE_EDEFAULT;

	/**
	 * This is true if the Gradient Temperature attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gradientTemperatureESet;

	/**
	 * The default value of the '{@link #getGradientDetailleTemperature() <em>Gradient Detaille Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientDetailleTemperature()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAtmosphereGradientDetailleTemperature GRADIENT_DETAILLE_TEMPERATURE_EDEFAULT = TypeDictionaryDicoAtmosphereGradientDetailleTemperature._2;

	/**
	 * The cached value of the '{@link #getGradientDetailleTemperature() <em>Gradient Detaille Temperature</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradientDetailleTemperature()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAtmosphereGradientDetailleTemperature gradientDetailleTemperature = GRADIENT_DETAILLE_TEMPERATURE_EDEFAULT;

	/**
	 * This is true if the Gradient Detaille Temperature attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean gradientDetailleTemperatureESet;

	/**
	 * The default value of the '{@link #getCoucheInversion() <em>Couche Inversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoucheInversion()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAtmosphereCoucheInversion COUCHE_INVERSION_EDEFAULT = TypeDictionaryDicoAtmosphereCoucheInversion.A;

	/**
	 * The cached value of the '{@link #getCoucheInversion() <em>Couche Inversion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoucheInversion()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAtmosphereCoucheInversion coucheInversion = COUCHE_INVERSION_EDEFAULT;

	/**
	 * This is true if the Couche Inversion attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean coucheInversionESet;

	/**
	 * The default value of the '{@link #getSystemePression() <em>Systeme Pression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemePression()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoAtmosphereSystemePression SYSTEME_PRESSION_EDEFAULT = TypeDictionaryDicoAtmosphereSystemePression.CLDFRT;

	/**
	 * The cached value of the '{@link #getSystemePression() <em>Systeme Pression</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSystemePression()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoAtmosphereSystemePression systemePression = SYSTEME_PRESSION_EDEFAULT;

	/**
	 * This is true if the Systeme Pression attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean systemePressionESet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeAtmosphereImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeAtmosphere();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getHumidite() {
		return humidite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHumidite(double newHumidite) {
		double oldHumidite = humidite;
		humidite = newHumidite;
		boolean oldHumiditeESet = humiditeESet;
		humiditeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ATMOSPHERE__HUMIDITE, oldHumidite, humidite, !oldHumiditeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetHumidite() {
		double oldHumidite = humidite;
		boolean oldHumiditeESet = humiditeESet;
		humidite = HUMIDITE_EDEFAULT;
		humiditeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ATMOSPHERE__HUMIDITE, oldHumidite, HUMIDITE_EDEFAULT, oldHumiditeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHumidite() {
		return humiditeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypePression getPression() {
		return pression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPression(TypeDataTypePression newPression, NotificationChain msgs) {
		TypeDataTypePression oldPression = pression;
		pression = newPression;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ATMOSPHERE__PRESSION, oldPression, newPression);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPression(TypeDataTypePression newPression) {
		if (newPression != pression) {
			NotificationChain msgs = null;
			if (pression != null)
				msgs = ((InternalEObject)pression).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ATMOSPHERE__PRESSION, null, msgs);
			if (newPression != null)
				msgs = ((InternalEObject)newPression).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ATMOSPHERE__PRESSION, null, msgs);
			msgs = basicSetPression(newPression, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ATMOSPHERE__PRESSION, newPression, newPression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeTemperature getTemperature() {
		return temperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTemperature(TypeDataTypeTemperature newTemperature, NotificationChain msgs) {
		TypeDataTypeTemperature oldTemperature = temperature;
		temperature = newTemperature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ATMOSPHERE__TEMPERATURE, oldTemperature, newTemperature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTemperature(TypeDataTypeTemperature newTemperature) {
		if (newTemperature != temperature) {
			NotificationChain msgs = null;
			if (temperature != null)
				msgs = ((InternalEObject)temperature).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ATMOSPHERE__TEMPERATURE, null, msgs);
			if (newTemperature != null)
				msgs = ((InternalEObject)newTemperature).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_ATMOSPHERE__TEMPERATURE, null, msgs);
			msgs = basicSetTemperature(newTemperature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ATMOSPHERE__TEMPERATURE, newTemperature, newTemperature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAtmosphereGradientTemperature getGradientTemperature() {
		return gradientTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGradientTemperature(TypeDictionaryDicoAtmosphereGradientTemperature newGradientTemperature) {
		TypeDictionaryDicoAtmosphereGradientTemperature oldGradientTemperature = gradientTemperature;
		gradientTemperature = newGradientTemperature == null ? GRADIENT_TEMPERATURE_EDEFAULT : newGradientTemperature;
		boolean oldGradientTemperatureESet = gradientTemperatureESet;
		gradientTemperatureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ATMOSPHERE__GRADIENT_TEMPERATURE, oldGradientTemperature, gradientTemperature, !oldGradientTemperatureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGradientTemperature() {
		TypeDictionaryDicoAtmosphereGradientTemperature oldGradientTemperature = gradientTemperature;
		boolean oldGradientTemperatureESet = gradientTemperatureESet;
		gradientTemperature = GRADIENT_TEMPERATURE_EDEFAULT;
		gradientTemperatureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ATMOSPHERE__GRADIENT_TEMPERATURE, oldGradientTemperature, GRADIENT_TEMPERATURE_EDEFAULT, oldGradientTemperatureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGradientTemperature() {
		return gradientTemperatureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAtmosphereGradientDetailleTemperature getGradientDetailleTemperature() {
		return gradientDetailleTemperature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGradientDetailleTemperature(TypeDictionaryDicoAtmosphereGradientDetailleTemperature newGradientDetailleTemperature) {
		TypeDictionaryDicoAtmosphereGradientDetailleTemperature oldGradientDetailleTemperature = gradientDetailleTemperature;
		gradientDetailleTemperature = newGradientDetailleTemperature == null ? GRADIENT_DETAILLE_TEMPERATURE_EDEFAULT : newGradientDetailleTemperature;
		boolean oldGradientDetailleTemperatureESet = gradientDetailleTemperatureESet;
		gradientDetailleTemperatureESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ATMOSPHERE__GRADIENT_DETAILLE_TEMPERATURE, oldGradientDetailleTemperature, gradientDetailleTemperature, !oldGradientDetailleTemperatureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetGradientDetailleTemperature() {
		TypeDictionaryDicoAtmosphereGradientDetailleTemperature oldGradientDetailleTemperature = gradientDetailleTemperature;
		boolean oldGradientDetailleTemperatureESet = gradientDetailleTemperatureESet;
		gradientDetailleTemperature = GRADIENT_DETAILLE_TEMPERATURE_EDEFAULT;
		gradientDetailleTemperatureESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ATMOSPHERE__GRADIENT_DETAILLE_TEMPERATURE, oldGradientDetailleTemperature, GRADIENT_DETAILLE_TEMPERATURE_EDEFAULT, oldGradientDetailleTemperatureESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGradientDetailleTemperature() {
		return gradientDetailleTemperatureESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAtmosphereCoucheInversion getCoucheInversion() {
		return coucheInversion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoucheInversion(TypeDictionaryDicoAtmosphereCoucheInversion newCoucheInversion) {
		TypeDictionaryDicoAtmosphereCoucheInversion oldCoucheInversion = coucheInversion;
		coucheInversion = newCoucheInversion == null ? COUCHE_INVERSION_EDEFAULT : newCoucheInversion;
		boolean oldCoucheInversionESet = coucheInversionESet;
		coucheInversionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ATMOSPHERE__COUCHE_INVERSION, oldCoucheInversion, coucheInversion, !oldCoucheInversionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetCoucheInversion() {
		TypeDictionaryDicoAtmosphereCoucheInversion oldCoucheInversion = coucheInversion;
		boolean oldCoucheInversionESet = coucheInversionESet;
		coucheInversion = COUCHE_INVERSION_EDEFAULT;
		coucheInversionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ATMOSPHERE__COUCHE_INVERSION, oldCoucheInversion, COUCHE_INVERSION_EDEFAULT, oldCoucheInversionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetCoucheInversion() {
		return coucheInversionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoAtmosphereSystemePression getSystemePression() {
		return systemePression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSystemePression(TypeDictionaryDicoAtmosphereSystemePression newSystemePression) {
		TypeDictionaryDicoAtmosphereSystemePression oldSystemePression = systemePression;
		systemePression = newSystemePression == null ? SYSTEME_PRESSION_EDEFAULT : newSystemePression;
		boolean oldSystemePressionESet = systemePressionESet;
		systemePressionESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_ATMOSPHERE__SYSTEME_PRESSION, oldSystemePression, systemePression, !oldSystemePressionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetSystemePression() {
		TypeDictionaryDicoAtmosphereSystemePression oldSystemePression = systemePression;
		boolean oldSystemePressionESet = systemePressionESet;
		systemePression = SYSTEME_PRESSION_EDEFAULT;
		systemePressionESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_ATMOSPHERE__SYSTEME_PRESSION, oldSystemePression, SYSTEME_PRESSION_EDEFAULT, oldSystemePressionESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSystemePression() {
		return systemePressionESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_ATMOSPHERE__PRESSION:
				return basicSetPression(null, msgs);
			case SchemaPackage.TYPE_ATMOSPHERE__TEMPERATURE:
				return basicSetTemperature(null, msgs);
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
			case SchemaPackage.TYPE_ATMOSPHERE__HUMIDITE:
				return new Double(getHumidite());
			case SchemaPackage.TYPE_ATMOSPHERE__PRESSION:
				return getPression();
			case SchemaPackage.TYPE_ATMOSPHERE__TEMPERATURE:
				return getTemperature();
			case SchemaPackage.TYPE_ATMOSPHERE__GRADIENT_TEMPERATURE:
				return getGradientTemperature();
			case SchemaPackage.TYPE_ATMOSPHERE__GRADIENT_DETAILLE_TEMPERATURE:
				return getGradientDetailleTemperature();
			case SchemaPackage.TYPE_ATMOSPHERE__COUCHE_INVERSION:
				return getCoucheInversion();
			case SchemaPackage.TYPE_ATMOSPHERE__SYSTEME_PRESSION:
				return getSystemePression();
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
			case SchemaPackage.TYPE_ATMOSPHERE__HUMIDITE:
				setHumidite(((Double)newValue).doubleValue());
				return;
			case SchemaPackage.TYPE_ATMOSPHERE__PRESSION:
				setPression((TypeDataTypePression)newValue);
				return;
			case SchemaPackage.TYPE_ATMOSPHERE__TEMPERATURE:
				setTemperature((TypeDataTypeTemperature)newValue);
				return;
			case SchemaPackage.TYPE_ATMOSPHERE__GRADIENT_TEMPERATURE:
				setGradientTemperature((TypeDictionaryDicoAtmosphereGradientTemperature)newValue);
				return;
			case SchemaPackage.TYPE_ATMOSPHERE__GRADIENT_DETAILLE_TEMPERATURE:
				setGradientDetailleTemperature((TypeDictionaryDicoAtmosphereGradientDetailleTemperature)newValue);
				return;
			case SchemaPackage.TYPE_ATMOSPHERE__COUCHE_INVERSION:
				setCoucheInversion((TypeDictionaryDicoAtmosphereCoucheInversion)newValue);
				return;
			case SchemaPackage.TYPE_ATMOSPHERE__SYSTEME_PRESSION:
				setSystemePression((TypeDictionaryDicoAtmosphereSystemePression)newValue);
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
			case SchemaPackage.TYPE_ATMOSPHERE__HUMIDITE:
				unsetHumidite();
				return;
			case SchemaPackage.TYPE_ATMOSPHERE__PRESSION:
				setPression((TypeDataTypePression)null);
				return;
			case SchemaPackage.TYPE_ATMOSPHERE__TEMPERATURE:
				setTemperature((TypeDataTypeTemperature)null);
				return;
			case SchemaPackage.TYPE_ATMOSPHERE__GRADIENT_TEMPERATURE:
				unsetGradientTemperature();
				return;
			case SchemaPackage.TYPE_ATMOSPHERE__GRADIENT_DETAILLE_TEMPERATURE:
				unsetGradientDetailleTemperature();
				return;
			case SchemaPackage.TYPE_ATMOSPHERE__COUCHE_INVERSION:
				unsetCoucheInversion();
				return;
			case SchemaPackage.TYPE_ATMOSPHERE__SYSTEME_PRESSION:
				unsetSystemePression();
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
			case SchemaPackage.TYPE_ATMOSPHERE__HUMIDITE:
				return isSetHumidite();
			case SchemaPackage.TYPE_ATMOSPHERE__PRESSION:
				return pression != null;
			case SchemaPackage.TYPE_ATMOSPHERE__TEMPERATURE:
				return temperature != null;
			case SchemaPackage.TYPE_ATMOSPHERE__GRADIENT_TEMPERATURE:
				return isSetGradientTemperature();
			case SchemaPackage.TYPE_ATMOSPHERE__GRADIENT_DETAILLE_TEMPERATURE:
				return isSetGradientDetailleTemperature();
			case SchemaPackage.TYPE_ATMOSPHERE__COUCHE_INVERSION:
				return isSetCoucheInversion();
			case SchemaPackage.TYPE_ATMOSPHERE__SYSTEME_PRESSION:
				return isSetSystemePression();
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
		result.append(" (humidite: ");
		if (humiditeESet) result.append(humidite); else result.append("<unset>");
		result.append(", gradientTemperature: ");
		if (gradientTemperatureESet) result.append(gradientTemperature); else result.append("<unset>");
		result.append(", gradientDetailleTemperature: ");
		if (gradientDetailleTemperatureESet) result.append(gradientDetailleTemperature); else result.append("<unset>");
		result.append(", coucheInversion: ");
		if (coucheInversionESet) result.append(coucheInversion); else result.append("<unset>");
		result.append(", systemePression: ");
		if (systemePressionESet) result.append(systemePression); else result.append("<unset>");
		result.append(')');
		return result.toString();
	}

} //TypeAtmosphereImpl
