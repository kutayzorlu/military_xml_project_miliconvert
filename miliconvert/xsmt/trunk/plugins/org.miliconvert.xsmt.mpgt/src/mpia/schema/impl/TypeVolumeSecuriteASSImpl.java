/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeDataTypeAltitudePression;
import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeLongueur;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeCoordonneesLatLong;
import mpia.schema.TypeVolumeSecuriteASS;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Volume Securite ASS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeVolumeSecuriteASSImpl#getGrandeDimension <em>Grande Dimension</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVolumeSecuriteASSImpl#getPetiteDimension <em>Petite Dimension</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVolumeSecuriteASSImpl#getGisementGrandeDimension <em>Gisement Grande Dimension</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVolumeSecuriteASSImpl#getAltitudeMinimum <em>Altitude Minimum</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVolumeSecuriteASSImpl#getAltitudeMaximum <em>Altitude Maximum</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVolumeSecuriteASSImpl#getDebutValidite <em>Debut Validite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVolumeSecuriteASSImpl#getFinValidite <em>Fin Validite</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeVolumeSecuriteASSImpl#getAPourCentreCoordonneesLatLong <em>APour Centre Coordonnees Lat Long</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeVolumeSecuriteASSImpl extends EObjectImpl implements TypeVolumeSecuriteASS {
	/**
	 * The cached value of the '{@link #getGrandeDimension() <em>Grande Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrandeDimension()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur grandeDimension;

	/**
	 * The cached value of the '{@link #getPetiteDimension() <em>Petite Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPetiteDimension()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeLongueur petiteDimension;

	/**
	 * The cached value of the '{@link #getGisementGrandeDimension() <em>Gisement Grande Dimension</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGisementGrandeDimension()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle gisementGrandeDimension;

	/**
	 * The cached value of the '{@link #getAltitudeMinimum() <em>Altitude Minimum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitudeMinimum()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAltitudePression altitudeMinimum;

	/**
	 * The cached value of the '{@link #getAltitudeMaximum() <em>Altitude Maximum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAltitudeMaximum()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAltitudePression altitudeMaximum;

	/**
	 * The default value of the '{@link #getDebutValidite() <em>Debut Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutValidite()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DEBUT_VALIDITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDebutValidite() <em>Debut Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDebutValidite()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar debutValidite = DEBUT_VALIDITE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFinValidite() <em>Fin Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinValidite()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar FIN_VALIDITE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFinValidite() <em>Fin Validite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFinValidite()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar finValidite = FIN_VALIDITE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourCentreCoordonneesLatLong() <em>APour Centre Coordonnees Lat Long</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourCentreCoordonneesLatLong()
	 * @generated
	 * @ordered
	 */
	protected TypeCoordonneesLatLong aPourCentreCoordonneesLatLong;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeVolumeSecuriteASSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeVolumeSecuriteASS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getGrandeDimension() {
		return grandeDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrandeDimension(TypeDataTypeLongueur newGrandeDimension, NotificationChain msgs) {
		TypeDataTypeLongueur oldGrandeDimension = grandeDimension;
		grandeDimension = newGrandeDimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOLUME_SECURITE_ASS__GRANDE_DIMENSION, oldGrandeDimension, newGrandeDimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrandeDimension(TypeDataTypeLongueur newGrandeDimension) {
		if (newGrandeDimension != grandeDimension) {
			NotificationChain msgs = null;
			if (grandeDimension != null)
				msgs = ((InternalEObject)grandeDimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VOLUME_SECURITE_ASS__GRANDE_DIMENSION, null, msgs);
			if (newGrandeDimension != null)
				msgs = ((InternalEObject)newGrandeDimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VOLUME_SECURITE_ASS__GRANDE_DIMENSION, null, msgs);
			msgs = basicSetGrandeDimension(newGrandeDimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOLUME_SECURITE_ASS__GRANDE_DIMENSION, newGrandeDimension, newGrandeDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeLongueur getPetiteDimension() {
		return petiteDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPetiteDimension(TypeDataTypeLongueur newPetiteDimension, NotificationChain msgs) {
		TypeDataTypeLongueur oldPetiteDimension = petiteDimension;
		petiteDimension = newPetiteDimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOLUME_SECURITE_ASS__PETITE_DIMENSION, oldPetiteDimension, newPetiteDimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPetiteDimension(TypeDataTypeLongueur newPetiteDimension) {
		if (newPetiteDimension != petiteDimension) {
			NotificationChain msgs = null;
			if (petiteDimension != null)
				msgs = ((InternalEObject)petiteDimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VOLUME_SECURITE_ASS__PETITE_DIMENSION, null, msgs);
			if (newPetiteDimension != null)
				msgs = ((InternalEObject)newPetiteDimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VOLUME_SECURITE_ASS__PETITE_DIMENSION, null, msgs);
			msgs = basicSetPetiteDimension(newPetiteDimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOLUME_SECURITE_ASS__PETITE_DIMENSION, newPetiteDimension, newPetiteDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getGisementGrandeDimension() {
		return gisementGrandeDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGisementGrandeDimension(TypeDataTypeAngle newGisementGrandeDimension, NotificationChain msgs) {
		TypeDataTypeAngle oldGisementGrandeDimension = gisementGrandeDimension;
		gisementGrandeDimension = newGisementGrandeDimension;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOLUME_SECURITE_ASS__GISEMENT_GRANDE_DIMENSION, oldGisementGrandeDimension, newGisementGrandeDimension);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGisementGrandeDimension(TypeDataTypeAngle newGisementGrandeDimension) {
		if (newGisementGrandeDimension != gisementGrandeDimension) {
			NotificationChain msgs = null;
			if (gisementGrandeDimension != null)
				msgs = ((InternalEObject)gisementGrandeDimension).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VOLUME_SECURITE_ASS__GISEMENT_GRANDE_DIMENSION, null, msgs);
			if (newGisementGrandeDimension != null)
				msgs = ((InternalEObject)newGisementGrandeDimension).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VOLUME_SECURITE_ASS__GISEMENT_GRANDE_DIMENSION, null, msgs);
			msgs = basicSetGisementGrandeDimension(newGisementGrandeDimension, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOLUME_SECURITE_ASS__GISEMENT_GRANDE_DIMENSION, newGisementGrandeDimension, newGisementGrandeDimension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAltitudePression getAltitudeMinimum() {
		return altitudeMinimum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitudeMinimum(TypeDataTypeAltitudePression newAltitudeMinimum, NotificationChain msgs) {
		TypeDataTypeAltitudePression oldAltitudeMinimum = altitudeMinimum;
		altitudeMinimum = newAltitudeMinimum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOLUME_SECURITE_ASS__ALTITUDE_MINIMUM, oldAltitudeMinimum, newAltitudeMinimum);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltitudeMinimum(TypeDataTypeAltitudePression newAltitudeMinimum) {
		if (newAltitudeMinimum != altitudeMinimum) {
			NotificationChain msgs = null;
			if (altitudeMinimum != null)
				msgs = ((InternalEObject)altitudeMinimum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VOLUME_SECURITE_ASS__ALTITUDE_MINIMUM, null, msgs);
			if (newAltitudeMinimum != null)
				msgs = ((InternalEObject)newAltitudeMinimum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VOLUME_SECURITE_ASS__ALTITUDE_MINIMUM, null, msgs);
			msgs = basicSetAltitudeMinimum(newAltitudeMinimum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOLUME_SECURITE_ASS__ALTITUDE_MINIMUM, newAltitudeMinimum, newAltitudeMinimum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAltitudePression getAltitudeMaximum() {
		return altitudeMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAltitudeMaximum(TypeDataTypeAltitudePression newAltitudeMaximum, NotificationChain msgs) {
		TypeDataTypeAltitudePression oldAltitudeMaximum = altitudeMaximum;
		altitudeMaximum = newAltitudeMaximum;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOLUME_SECURITE_ASS__ALTITUDE_MAXIMUM, oldAltitudeMaximum, newAltitudeMaximum);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAltitudeMaximum(TypeDataTypeAltitudePression newAltitudeMaximum) {
		if (newAltitudeMaximum != altitudeMaximum) {
			NotificationChain msgs = null;
			if (altitudeMaximum != null)
				msgs = ((InternalEObject)altitudeMaximum).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VOLUME_SECURITE_ASS__ALTITUDE_MAXIMUM, null, msgs);
			if (newAltitudeMaximum != null)
				msgs = ((InternalEObject)newAltitudeMaximum).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VOLUME_SECURITE_ASS__ALTITUDE_MAXIMUM, null, msgs);
			msgs = basicSetAltitudeMaximum(newAltitudeMaximum, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOLUME_SECURITE_ASS__ALTITUDE_MAXIMUM, newAltitudeMaximum, newAltitudeMaximum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDebutValidite() {
		return debutValidite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDebutValidite(XMLGregorianCalendar newDebutValidite) {
		XMLGregorianCalendar oldDebutValidite = debutValidite;
		debutValidite = newDebutValidite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOLUME_SECURITE_ASS__DEBUT_VALIDITE, oldDebutValidite, debutValidite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getFinValidite() {
		return finValidite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFinValidite(XMLGregorianCalendar newFinValidite) {
		XMLGregorianCalendar oldFinValidite = finValidite;
		finValidite = newFinValidite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOLUME_SECURITE_ASS__FIN_VALIDITE, oldFinValidite, finValidite));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeCoordonneesLatLong getAPourCentreCoordonneesLatLong() {
		return aPourCentreCoordonneesLatLong;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourCentreCoordonneesLatLong(TypeCoordonneesLatLong newAPourCentreCoordonneesLatLong, NotificationChain msgs) {
		TypeCoordonneesLatLong oldAPourCentreCoordonneesLatLong = aPourCentreCoordonneesLatLong;
		aPourCentreCoordonneesLatLong = newAPourCentreCoordonneesLatLong;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOLUME_SECURITE_ASS__APOUR_CENTRE_COORDONNEES_LAT_LONG, oldAPourCentreCoordonneesLatLong, newAPourCentreCoordonneesLatLong);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourCentreCoordonneesLatLong(TypeCoordonneesLatLong newAPourCentreCoordonneesLatLong) {
		if (newAPourCentreCoordonneesLatLong != aPourCentreCoordonneesLatLong) {
			NotificationChain msgs = null;
			if (aPourCentreCoordonneesLatLong != null)
				msgs = ((InternalEObject)aPourCentreCoordonneesLatLong).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VOLUME_SECURITE_ASS__APOUR_CENTRE_COORDONNEES_LAT_LONG, null, msgs);
			if (newAPourCentreCoordonneesLatLong != null)
				msgs = ((InternalEObject)newAPourCentreCoordonneesLatLong).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_VOLUME_SECURITE_ASS__APOUR_CENTRE_COORDONNEES_LAT_LONG, null, msgs);
			msgs = basicSetAPourCentreCoordonneesLatLong(newAPourCentreCoordonneesLatLong, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_VOLUME_SECURITE_ASS__APOUR_CENTRE_COORDONNEES_LAT_LONG, newAPourCentreCoordonneesLatLong, newAPourCentreCoordonneesLatLong));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__GRANDE_DIMENSION:
				return basicSetGrandeDimension(null, msgs);
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__PETITE_DIMENSION:
				return basicSetPetiteDimension(null, msgs);
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__GISEMENT_GRANDE_DIMENSION:
				return basicSetGisementGrandeDimension(null, msgs);
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__ALTITUDE_MINIMUM:
				return basicSetAltitudeMinimum(null, msgs);
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__ALTITUDE_MAXIMUM:
				return basicSetAltitudeMaximum(null, msgs);
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__APOUR_CENTRE_COORDONNEES_LAT_LONG:
				return basicSetAPourCentreCoordonneesLatLong(null, msgs);
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
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__GRANDE_DIMENSION:
				return getGrandeDimension();
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__PETITE_DIMENSION:
				return getPetiteDimension();
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__GISEMENT_GRANDE_DIMENSION:
				return getGisementGrandeDimension();
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__ALTITUDE_MINIMUM:
				return getAltitudeMinimum();
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__ALTITUDE_MAXIMUM:
				return getAltitudeMaximum();
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__DEBUT_VALIDITE:
				return getDebutValidite();
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__FIN_VALIDITE:
				return getFinValidite();
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__APOUR_CENTRE_COORDONNEES_LAT_LONG:
				return getAPourCentreCoordonneesLatLong();
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
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__GRANDE_DIMENSION:
				setGrandeDimension((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__PETITE_DIMENSION:
				setPetiteDimension((TypeDataTypeLongueur)newValue);
				return;
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__GISEMENT_GRANDE_DIMENSION:
				setGisementGrandeDimension((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__ALTITUDE_MINIMUM:
				setAltitudeMinimum((TypeDataTypeAltitudePression)newValue);
				return;
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__ALTITUDE_MAXIMUM:
				setAltitudeMaximum((TypeDataTypeAltitudePression)newValue);
				return;
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__DEBUT_VALIDITE:
				setDebutValidite((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__FIN_VALIDITE:
				setFinValidite((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__APOUR_CENTRE_COORDONNEES_LAT_LONG:
				setAPourCentreCoordonneesLatLong((TypeCoordonneesLatLong)newValue);
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
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__GRANDE_DIMENSION:
				setGrandeDimension((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__PETITE_DIMENSION:
				setPetiteDimension((TypeDataTypeLongueur)null);
				return;
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__GISEMENT_GRANDE_DIMENSION:
				setGisementGrandeDimension((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__ALTITUDE_MINIMUM:
				setAltitudeMinimum((TypeDataTypeAltitudePression)null);
				return;
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__ALTITUDE_MAXIMUM:
				setAltitudeMaximum((TypeDataTypeAltitudePression)null);
				return;
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__DEBUT_VALIDITE:
				setDebutValidite(DEBUT_VALIDITE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__FIN_VALIDITE:
				setFinValidite(FIN_VALIDITE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__APOUR_CENTRE_COORDONNEES_LAT_LONG:
				setAPourCentreCoordonneesLatLong((TypeCoordonneesLatLong)null);
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
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__GRANDE_DIMENSION:
				return grandeDimension != null;
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__PETITE_DIMENSION:
				return petiteDimension != null;
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__GISEMENT_GRANDE_DIMENSION:
				return gisementGrandeDimension != null;
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__ALTITUDE_MINIMUM:
				return altitudeMinimum != null;
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__ALTITUDE_MAXIMUM:
				return altitudeMaximum != null;
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__DEBUT_VALIDITE:
				return DEBUT_VALIDITE_EDEFAULT == null ? debutValidite != null : !DEBUT_VALIDITE_EDEFAULT.equals(debutValidite);
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__FIN_VALIDITE:
				return FIN_VALIDITE_EDEFAULT == null ? finValidite != null : !FIN_VALIDITE_EDEFAULT.equals(finValidite);
			case SchemaPackage.TYPE_VOLUME_SECURITE_ASS__APOUR_CENTRE_COORDONNEES_LAT_LONG:
				return aPourCentreCoordonneesLatLong != null;
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
		result.append(" (debutValidite: ");
		result.append(debutValidite);
		result.append(", finValidite: ");
		result.append(finValidite);
		result.append(')');
		return result.toString();
	}

} //TypeVolumeSecuriteASSImpl
