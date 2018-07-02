/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import java.util.Collection;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeDataTypeAltitudePression;
import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypePression;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeBulletinSondage;
import mpia.schema.TypePalierSondage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Bulletin Sondage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeBulletinSondageImpl#getIdStation <em>Id Station</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBulletinSondageImpl#getDateValiditeObservation <em>Date Validite Observation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBulletinSondageImpl#getDureeValiditeObservation <em>Duree Validite Observation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBulletinSondageImpl#getPressionLocaleStation <em>Pression Locale Station</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBulletinSondageImpl#getAltitudeLocaleStation <em>Altitude Locale Station</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeBulletinSondageImpl#getSeComposePalierSondage <em>Se Compose Palier Sondage</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeBulletinSondageImpl extends TypeInstanceObjetImpl implements TypeBulletinSondage {
	/**
	 * The default value of the '{@link #getIdStation() <em>Id Station</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdStation()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_STATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIdStation() <em>Id Station</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIdStation()
	 * @generated
	 * @ordered
	 */
	protected String idStation = ID_STATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateValiditeObservation() <em>Date Validite Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateValiditeObservation()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_VALIDITE_OBSERVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateValiditeObservation() <em>Date Validite Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateValiditeObservation()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateValiditeObservation = DATE_VALIDITE_OBSERVATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDureeValiditeObservation() <em>Duree Validite Observation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeValiditeObservation()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureeValiditeObservation;

	/**
	 * The cached value of the '{@link #getPressionLocaleStation() <em>Pression Locale Station</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPressionLocaleStation()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypePression pressionLocaleStation;

	/**
	 * The cached value of the '{@link #getAltitudeLocaleStation() <em>Altitude Locale Station</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitudeLocaleStation()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAltitudePression altitudeLocaleStation;

	/**
	 * The cached value of the '{@link #getSeComposePalierSondage() <em>Se Compose Palier Sondage</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeComposePalierSondage()
	 * @generated
	 * @ordered
	 */
	protected EList<TypePalierSondage> seComposePalierSondage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeBulletinSondageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeBulletinSondage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getIdStation() {
		return idStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIdStation(String newIdStation) {
		String oldIdStation = idStation;
		idStation = newIdStation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BULLETIN_SONDAGE__ID_STATION, oldIdStation, idStation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateValiditeObservation() {
		return dateValiditeObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateValiditeObservation(XMLGregorianCalendar newDateValiditeObservation) {
		XMLGregorianCalendar oldDateValiditeObservation = dateValiditeObservation;
		dateValiditeObservation = newDateValiditeObservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BULLETIN_SONDAGE__DATE_VALIDITE_OBSERVATION, oldDateValiditeObservation, dateValiditeObservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureeValiditeObservation() {
		return dureeValiditeObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureeValiditeObservation(TypeDataTypeDuree newDureeValiditeObservation, NotificationChain msgs) {
		TypeDataTypeDuree oldDureeValiditeObservation = dureeValiditeObservation;
		dureeValiditeObservation = newDureeValiditeObservation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BULLETIN_SONDAGE__DUREE_VALIDITE_OBSERVATION, oldDureeValiditeObservation, newDureeValiditeObservation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeValiditeObservation(TypeDataTypeDuree newDureeValiditeObservation) {
		if (newDureeValiditeObservation != dureeValiditeObservation) {
			NotificationChain msgs = null;
			if (dureeValiditeObservation != null)
				msgs = ((InternalEObject)dureeValiditeObservation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BULLETIN_SONDAGE__DUREE_VALIDITE_OBSERVATION, null, msgs);
			if (newDureeValiditeObservation != null)
				msgs = ((InternalEObject)newDureeValiditeObservation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BULLETIN_SONDAGE__DUREE_VALIDITE_OBSERVATION, null, msgs);
			msgs = basicSetDureeValiditeObservation(newDureeValiditeObservation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BULLETIN_SONDAGE__DUREE_VALIDITE_OBSERVATION, newDureeValiditeObservation, newDureeValiditeObservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypePression getPressionLocaleStation() {
		return pressionLocaleStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPressionLocaleStation(TypeDataTypePression newPressionLocaleStation, NotificationChain msgs) {
		TypeDataTypePression oldPressionLocaleStation = pressionLocaleStation;
		pressionLocaleStation = newPressionLocaleStation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BULLETIN_SONDAGE__PRESSION_LOCALE_STATION, oldPressionLocaleStation, newPressionLocaleStation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPressionLocaleStation(TypeDataTypePression newPressionLocaleStation) {
		if (newPressionLocaleStation != pressionLocaleStation) {
			NotificationChain msgs = null;
			if (pressionLocaleStation != null)
				msgs = ((InternalEObject)pressionLocaleStation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BULLETIN_SONDAGE__PRESSION_LOCALE_STATION, null, msgs);
			if (newPressionLocaleStation != null)
				msgs = ((InternalEObject)newPressionLocaleStation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BULLETIN_SONDAGE__PRESSION_LOCALE_STATION, null, msgs);
			msgs = basicSetPressionLocaleStation(newPressionLocaleStation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BULLETIN_SONDAGE__PRESSION_LOCALE_STATION, newPressionLocaleStation, newPressionLocaleStation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAltitudePression getAltitudeLocaleStation() {
		return altitudeLocaleStation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitudeLocaleStation(TypeDataTypeAltitudePression newAltitudeLocaleStation, NotificationChain msgs) {
		TypeDataTypeAltitudePression oldAltitudeLocaleStation = altitudeLocaleStation;
		altitudeLocaleStation = newAltitudeLocaleStation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BULLETIN_SONDAGE__ALTITUDE_LOCALE_STATION, oldAltitudeLocaleStation, newAltitudeLocaleStation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltitudeLocaleStation(TypeDataTypeAltitudePression newAltitudeLocaleStation) {
		if (newAltitudeLocaleStation != altitudeLocaleStation) {
			NotificationChain msgs = null;
			if (altitudeLocaleStation != null)
				msgs = ((InternalEObject)altitudeLocaleStation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BULLETIN_SONDAGE__ALTITUDE_LOCALE_STATION, null, msgs);
			if (newAltitudeLocaleStation != null)
				msgs = ((InternalEObject)newAltitudeLocaleStation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_BULLETIN_SONDAGE__ALTITUDE_LOCALE_STATION, null, msgs);
			msgs = basicSetAltitudeLocaleStation(newAltitudeLocaleStation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_BULLETIN_SONDAGE__ALTITUDE_LOCALE_STATION, newAltitudeLocaleStation, newAltitudeLocaleStation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TypePalierSondage> getSeComposePalierSondage() {
		if (seComposePalierSondage == null) {
			seComposePalierSondage = new EObjectContainmentEList<TypePalierSondage>(TypePalierSondage.class, this, SchemaPackage.TYPE_BULLETIN_SONDAGE__SE_COMPOSE_PALIER_SONDAGE);
		}
		return seComposePalierSondage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_BULLETIN_SONDAGE__DUREE_VALIDITE_OBSERVATION:
				return basicSetDureeValiditeObservation(null, msgs);
			case SchemaPackage.TYPE_BULLETIN_SONDAGE__PRESSION_LOCALE_STATION:
				return basicSetPressionLocaleStation(null, msgs);
			case SchemaPackage.TYPE_BULLETIN_SONDAGE__ALTITUDE_LOCALE_STATION:
				return basicSetAltitudeLocaleStation(null, msgs);
			case SchemaPackage.TYPE_BULLETIN_SONDAGE__SE_COMPOSE_PALIER_SONDAGE:
				return ((InternalEList<?>)getSeComposePalierSondage()).basicRemove(otherEnd, msgs);
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
			case SchemaPackage.TYPE_BULLETIN_SONDAGE__ID_STATION:
				return getIdStation();
			case SchemaPackage.TYPE_BULLETIN_SONDAGE__DATE_VALIDITE_OBSERVATION:
				return getDateValiditeObservation();
			case SchemaPackage.TYPE_BULLETIN_SONDAGE__DUREE_VALIDITE_OBSERVATION:
				return getDureeValiditeObservation();
			case SchemaPackage.TYPE_BULLETIN_SONDAGE__PRESSION_LOCALE_STATION:
				return getPressionLocaleStation();
			case SchemaPackage.TYPE_BULLETIN_SONDAGE__ALTITUDE_LOCALE_STATION:
				return getAltitudeLocaleStation();
			case SchemaPackage.TYPE_BULLETIN_SONDAGE__SE_COMPOSE_PALIER_SONDAGE:
				return getSeComposePalierSondage();
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
			case SchemaPackage.TYPE_BULLETIN_SONDAGE__ID_STATION:
				setIdStation((String)newValue);
				return;
			case SchemaPackage.TYPE_BULLETIN_SONDAGE__DATE_VALIDITE_OBSERVATION:
				setDateValiditeObservation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_BULLETIN_SONDAGE__DUREE_VALIDITE_OBSERVATION:
				setDureeValiditeObservation((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_BULLETIN_SONDAGE__PRESSION_LOCALE_STATION:
				setPressionLocaleStation((TypeDataTypePression)newValue);
				return;
			case SchemaPackage.TYPE_BULLETIN_SONDAGE__ALTITUDE_LOCALE_STATION:
				setAltitudeLocaleStation((TypeDataTypeAltitudePression)newValue);
				return;
			case SchemaPackage.TYPE_BULLETIN_SONDAGE__SE_COMPOSE_PALIER_SONDAGE:
				getSeComposePalierSondage().clear();
				getSeComposePalierSondage().addAll((Collection<? extends TypePalierSondage>)newValue);
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
			case SchemaPackage.TYPE_BULLETIN_SONDAGE__ID_STATION:
				setIdStation(ID_STATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_BULLETIN_SONDAGE__DATE_VALIDITE_OBSERVATION:
				setDateValiditeObservation(DATE_VALIDITE_OBSERVATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_BULLETIN_SONDAGE__DUREE_VALIDITE_OBSERVATION:
				setDureeValiditeObservation((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_BULLETIN_SONDAGE__PRESSION_LOCALE_STATION:
				setPressionLocaleStation((TypeDataTypePression)null);
				return;
			case SchemaPackage.TYPE_BULLETIN_SONDAGE__ALTITUDE_LOCALE_STATION:
				setAltitudeLocaleStation((TypeDataTypeAltitudePression)null);
				return;
			case SchemaPackage.TYPE_BULLETIN_SONDAGE__SE_COMPOSE_PALIER_SONDAGE:
				getSeComposePalierSondage().clear();
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
			case SchemaPackage.TYPE_BULLETIN_SONDAGE__ID_STATION:
				return ID_STATION_EDEFAULT == null ? idStation != null : !ID_STATION_EDEFAULT.equals(idStation);
			case SchemaPackage.TYPE_BULLETIN_SONDAGE__DATE_VALIDITE_OBSERVATION:
				return DATE_VALIDITE_OBSERVATION_EDEFAULT == null ? dateValiditeObservation != null : !DATE_VALIDITE_OBSERVATION_EDEFAULT.equals(dateValiditeObservation);
			case SchemaPackage.TYPE_BULLETIN_SONDAGE__DUREE_VALIDITE_OBSERVATION:
				return dureeValiditeObservation != null;
			case SchemaPackage.TYPE_BULLETIN_SONDAGE__PRESSION_LOCALE_STATION:
				return pressionLocaleStation != null;
			case SchemaPackage.TYPE_BULLETIN_SONDAGE__ALTITUDE_LOCALE_STATION:
				return altitudeLocaleStation != null;
			case SchemaPackage.TYPE_BULLETIN_SONDAGE__SE_COMPOSE_PALIER_SONDAGE:
				return seComposePalierSondage != null && !seComposePalierSondage.isEmpty();
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
		result.append(" (idStation: ");
		result.append(idStation);
		result.append(", dateValiditeObservation: ");
		result.append(dateValiditeObservation);
		result.append(')');
		return result.toString();
	}

} //TypeBulletinSondageImpl
