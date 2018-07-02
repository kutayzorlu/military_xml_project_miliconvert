/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.TypeDataTypeAngle;
import mpia.meta.TypeDataTypeDuree;
import mpia.meta.TypeDataTypeVitesseLineaire;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeDictionaryDicoMobiliteAttitude;
import mpia.schema.TypeMobilite;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Mobilite</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeMobiliteImpl#getAttitude <em>Attitude</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMobiliteImpl#getCap <em>Cap</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMobiliteImpl#getVitesse <em>Vitesse</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMobiliteImpl#getDureeStationnement <em>Duree Stationnement</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeMobiliteImpl#getGDHeffectif <em>GD Heffectif</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeMobiliteImpl extends EObjectImpl implements TypeMobilite {
	/**
	 * The default value of the '{@link #getAttitude() <em>Attitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttitude()
	 * @generated
	 * @ordered
	 */
	protected static final TypeDictionaryDicoMobiliteAttitude ATTITUDE_EDEFAULT = TypeDictionaryDicoMobiliteAttitude.MVG;

	/**
	 * The cached value of the '{@link #getAttitude() <em>Attitude</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttitude()
	 * @generated
	 * @ordered
	 */
	protected TypeDictionaryDicoMobiliteAttitude attitude = ATTITUDE_EDEFAULT;

	/**
	 * This is true if the Attitude attribute has been set.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected boolean attitudeESet;

	/**
	 * The cached value of the '{@link #getCap() <em>Cap</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCap()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeAngle cap;

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
	 * The cached value of the '{@link #getDureeStationnement() <em>Duree Stationnement</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDureeStationnement()
	 * @generated
	 * @ordered
	 */
	protected TypeDataTypeDuree dureeStationnement;

	/**
	 * The default value of the '{@link #getGDHeffectif() <em>GD Heffectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHeffectif()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GD_HEFFECTIF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGDHeffectif() <em>GD Heffectif</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGDHeffectif()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gDHeffectif = GD_HEFFECTIF_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeMobiliteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeMobilite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDictionaryDicoMobiliteAttitude getAttitude() {
		return attitude;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAttitude(TypeDictionaryDicoMobiliteAttitude newAttitude) {
		TypeDictionaryDicoMobiliteAttitude oldAttitude = attitude;
		attitude = newAttitude == null ? ATTITUDE_EDEFAULT : newAttitude;
		boolean oldAttitudeESet = attitudeESet;
		attitudeESet = true;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOBILITE__ATTITUDE, oldAttitude, attitude, !oldAttitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetAttitude() {
		TypeDictionaryDicoMobiliteAttitude oldAttitude = attitude;
		boolean oldAttitudeESet = attitudeESet;
		attitude = ATTITUDE_EDEFAULT;
		attitudeESet = false;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.UNSET, SchemaPackage.TYPE_MOBILITE__ATTITUDE, oldAttitude, ATTITUDE_EDEFAULT, oldAttitudeESet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAttitude() {
		return attitudeESet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeAngle getCap() {
		return cap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCap(TypeDataTypeAngle newCap, NotificationChain msgs) {
		TypeDataTypeAngle oldCap = cap;
		cap = newCap;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOBILITE__CAP, oldCap, newCap);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCap(TypeDataTypeAngle newCap) {
		if (newCap != cap) {
			NotificationChain msgs = null;
			if (cap != null)
				msgs = ((InternalEObject)cap).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOBILITE__CAP, null, msgs);
			if (newCap != null)
				msgs = ((InternalEObject)newCap).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOBILITE__CAP, null, msgs);
			msgs = basicSetCap(newCap, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOBILITE__CAP, newCap, newCap));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOBILITE__VITESSE, oldVitesse, newVitesse);
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
				msgs = ((InternalEObject)vitesse).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOBILITE__VITESSE, null, msgs);
			if (newVitesse != null)
				msgs = ((InternalEObject)newVitesse).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOBILITE__VITESSE, null, msgs);
			msgs = basicSetVitesse(newVitesse, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOBILITE__VITESSE, newVitesse, newVitesse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeDataTypeDuree getDureeStationnement() {
		return dureeStationnement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDureeStationnement(TypeDataTypeDuree newDureeStationnement, NotificationChain msgs) {
		TypeDataTypeDuree oldDureeStationnement = dureeStationnement;
		dureeStationnement = newDureeStationnement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOBILITE__DUREE_STATIONNEMENT, oldDureeStationnement, newDureeStationnement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDureeStationnement(TypeDataTypeDuree newDureeStationnement) {
		if (newDureeStationnement != dureeStationnement) {
			NotificationChain msgs = null;
			if (dureeStationnement != null)
				msgs = ((InternalEObject)dureeStationnement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOBILITE__DUREE_STATIONNEMENT, null, msgs);
			if (newDureeStationnement != null)
				msgs = ((InternalEObject)newDureeStationnement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_MOBILITE__DUREE_STATIONNEMENT, null, msgs);
			msgs = basicSetDureeStationnement(newDureeStationnement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOBILITE__DUREE_STATIONNEMENT, newDureeStationnement, newDureeStationnement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGDHeffectif() {
		return gDHeffectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGDHeffectif(XMLGregorianCalendar newGDHeffectif) {
		XMLGregorianCalendar oldGDHeffectif = gDHeffectif;
		gDHeffectif = newGDHeffectif;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_MOBILITE__GD_HEFFECTIF, oldGDHeffectif, gDHeffectif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_MOBILITE__CAP:
				return basicSetCap(null, msgs);
			case SchemaPackage.TYPE_MOBILITE__VITESSE:
				return basicSetVitesse(null, msgs);
			case SchemaPackage.TYPE_MOBILITE__DUREE_STATIONNEMENT:
				return basicSetDureeStationnement(null, msgs);
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
			case SchemaPackage.TYPE_MOBILITE__ATTITUDE:
				return getAttitude();
			case SchemaPackage.TYPE_MOBILITE__CAP:
				return getCap();
			case SchemaPackage.TYPE_MOBILITE__VITESSE:
				return getVitesse();
			case SchemaPackage.TYPE_MOBILITE__DUREE_STATIONNEMENT:
				return getDureeStationnement();
			case SchemaPackage.TYPE_MOBILITE__GD_HEFFECTIF:
				return getGDHeffectif();
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
			case SchemaPackage.TYPE_MOBILITE__ATTITUDE:
				setAttitude((TypeDictionaryDicoMobiliteAttitude)newValue);
				return;
			case SchemaPackage.TYPE_MOBILITE__CAP:
				setCap((TypeDataTypeAngle)newValue);
				return;
			case SchemaPackage.TYPE_MOBILITE__VITESSE:
				setVitesse((TypeDataTypeVitesseLineaire)newValue);
				return;
			case SchemaPackage.TYPE_MOBILITE__DUREE_STATIONNEMENT:
				setDureeStationnement((TypeDataTypeDuree)newValue);
				return;
			case SchemaPackage.TYPE_MOBILITE__GD_HEFFECTIF:
				setGDHeffectif((XMLGregorianCalendar)newValue);
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
			case SchemaPackage.TYPE_MOBILITE__ATTITUDE:
				unsetAttitude();
				return;
			case SchemaPackage.TYPE_MOBILITE__CAP:
				setCap((TypeDataTypeAngle)null);
				return;
			case SchemaPackage.TYPE_MOBILITE__VITESSE:
				setVitesse((TypeDataTypeVitesseLineaire)null);
				return;
			case SchemaPackage.TYPE_MOBILITE__DUREE_STATIONNEMENT:
				setDureeStationnement((TypeDataTypeDuree)null);
				return;
			case SchemaPackage.TYPE_MOBILITE__GD_HEFFECTIF:
				setGDHeffectif(GD_HEFFECTIF_EDEFAULT);
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
			case SchemaPackage.TYPE_MOBILITE__ATTITUDE:
				return isSetAttitude();
			case SchemaPackage.TYPE_MOBILITE__CAP:
				return cap != null;
			case SchemaPackage.TYPE_MOBILITE__VITESSE:
				return vitesse != null;
			case SchemaPackage.TYPE_MOBILITE__DUREE_STATIONNEMENT:
				return dureeStationnement != null;
			case SchemaPackage.TYPE_MOBILITE__GD_HEFFECTIF:
				return GD_HEFFECTIF_EDEFAULT == null ? gDHeffectif != null : !GD_HEFFECTIF_EDEFAULT.equals(gDHeffectif);
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
		result.append(" (attitude: ");
		if (attitudeESet) result.append(attitude); else result.append("<unset>");
		result.append(", gDHeffectif: ");
		result.append(gDHeffectif);
		result.append(')');
		return result.toString();
	}

} //TypeMobiliteImpl
