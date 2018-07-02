/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.schema.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.schema.SchemaPackage;
import mpia.schema.TypeLocalisationObjectif;
import mpia.schema.TypeObjectifAlat;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Objectif Alat</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.schema.impl.TypeObjectifAlatImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifAlatImpl#getMenace <em>Menace</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifAlatImpl#getGdhObservation <em>Gdh Observation</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifAlatImpl#getLieu <em>Lieu</em>}</li>
 *   <li>{@link mpia.schema.impl.TypeObjectifAlatImpl#getAPourLocalisationLocalisationObjectif <em>APour Localisation Localisation Objectif</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeObjectifAlatImpl extends EObjectImpl implements TypeObjectifAlat {
	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMenace() <em>Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenace()
	 * @generated
	 * @ordered
	 */
	protected static final String MENACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMenace() <em>Menace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMenace()
	 * @generated
	 * @ordered
	 */
	protected String menace = MENACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getGdhObservation() <em>Gdh Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGdhObservation()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar GDH_OBSERVATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGdhObservation() <em>Gdh Observation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGdhObservation()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar gdhObservation = GDH_OBSERVATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLieu() <em>Lieu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLieu()
	 * @generated
	 * @ordered
	 */
	protected static final String LIEU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLieu() <em>Lieu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLieu()
	 * @generated
	 * @ordered
	 */
	protected String lieu = LIEU_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAPourLocalisationLocalisationObjectif() <em>APour Localisation Localisation Objectif</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAPourLocalisationLocalisationObjectif()
	 * @generated
	 * @ordered
	 */
	protected TypeLocalisationObjectif aPourLocalisationLocalisationObjectif;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeObjectifAlatImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SchemaPackage.eINSTANCE.getTypeObjectifAlat();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ALAT__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMenace() {
		return menace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMenace(String newMenace) {
		String oldMenace = menace;
		menace = newMenace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ALAT__MENACE, oldMenace, menace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getGdhObservation() {
		return gdhObservation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGdhObservation(XMLGregorianCalendar newGdhObservation) {
		XMLGregorianCalendar oldGdhObservation = gdhObservation;
		gdhObservation = newGdhObservation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ALAT__GDH_OBSERVATION, oldGdhObservation, gdhObservation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLieu() {
		return lieu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLieu(String newLieu) {
		String oldLieu = lieu;
		lieu = newLieu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ALAT__LIEU, oldLieu, lieu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeLocalisationObjectif getAPourLocalisationLocalisationObjectif() {
		return aPourLocalisationLocalisationObjectif;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAPourLocalisationLocalisationObjectif(TypeLocalisationObjectif newAPourLocalisationLocalisationObjectif, NotificationChain msgs) {
		TypeLocalisationObjectif oldAPourLocalisationLocalisationObjectif = aPourLocalisationLocalisationObjectif;
		aPourLocalisationLocalisationObjectif = newAPourLocalisationLocalisationObjectif;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ALAT__APOUR_LOCALISATION_LOCALISATION_OBJECTIF, oldAPourLocalisationLocalisationObjectif, newAPourLocalisationLocalisationObjectif);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAPourLocalisationLocalisationObjectif(TypeLocalisationObjectif newAPourLocalisationLocalisationObjectif) {
		if (newAPourLocalisationLocalisationObjectif != aPourLocalisationLocalisationObjectif) {
			NotificationChain msgs = null;
			if (aPourLocalisationLocalisationObjectif != null)
				msgs = ((InternalEObject)aPourLocalisationLocalisationObjectif).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_ALAT__APOUR_LOCALISATION_LOCALISATION_OBJECTIF, null, msgs);
			if (newAPourLocalisationLocalisationObjectif != null)
				msgs = ((InternalEObject)newAPourLocalisationLocalisationObjectif).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SchemaPackage.TYPE_OBJECTIF_ALAT__APOUR_LOCALISATION_LOCALISATION_OBJECTIF, null, msgs);
			msgs = basicSetAPourLocalisationLocalisationObjectif(newAPourLocalisationLocalisationObjectif, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SchemaPackage.TYPE_OBJECTIF_ALAT__APOUR_LOCALISATION_LOCALISATION_OBJECTIF, newAPourLocalisationLocalisationObjectif, newAPourLocalisationLocalisationObjectif));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SchemaPackage.TYPE_OBJECTIF_ALAT__APOUR_LOCALISATION_LOCALISATION_OBJECTIF:
				return basicSetAPourLocalisationLocalisationObjectif(null, msgs);
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
			case SchemaPackage.TYPE_OBJECTIF_ALAT__NOM:
				return getNom();
			case SchemaPackage.TYPE_OBJECTIF_ALAT__MENACE:
				return getMenace();
			case SchemaPackage.TYPE_OBJECTIF_ALAT__GDH_OBSERVATION:
				return getGdhObservation();
			case SchemaPackage.TYPE_OBJECTIF_ALAT__LIEU:
				return getLieu();
			case SchemaPackage.TYPE_OBJECTIF_ALAT__APOUR_LOCALISATION_LOCALISATION_OBJECTIF:
				return getAPourLocalisationLocalisationObjectif();
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
			case SchemaPackage.TYPE_OBJECTIF_ALAT__NOM:
				setNom((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ALAT__MENACE:
				setMenace((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ALAT__GDH_OBSERVATION:
				setGdhObservation((XMLGregorianCalendar)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ALAT__LIEU:
				setLieu((String)newValue);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ALAT__APOUR_LOCALISATION_LOCALISATION_OBJECTIF:
				setAPourLocalisationLocalisationObjectif((TypeLocalisationObjectif)newValue);
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
			case SchemaPackage.TYPE_OBJECTIF_ALAT__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ALAT__MENACE:
				setMenace(MENACE_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ALAT__GDH_OBSERVATION:
				setGdhObservation(GDH_OBSERVATION_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ALAT__LIEU:
				setLieu(LIEU_EDEFAULT);
				return;
			case SchemaPackage.TYPE_OBJECTIF_ALAT__APOUR_LOCALISATION_LOCALISATION_OBJECTIF:
				setAPourLocalisationLocalisationObjectif((TypeLocalisationObjectif)null);
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
			case SchemaPackage.TYPE_OBJECTIF_ALAT__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case SchemaPackage.TYPE_OBJECTIF_ALAT__MENACE:
				return MENACE_EDEFAULT == null ? menace != null : !MENACE_EDEFAULT.equals(menace);
			case SchemaPackage.TYPE_OBJECTIF_ALAT__GDH_OBSERVATION:
				return GDH_OBSERVATION_EDEFAULT == null ? gdhObservation != null : !GDH_OBSERVATION_EDEFAULT.equals(gdhObservation);
			case SchemaPackage.TYPE_OBJECTIF_ALAT__LIEU:
				return LIEU_EDEFAULT == null ? lieu != null : !LIEU_EDEFAULT.equals(lieu);
			case SchemaPackage.TYPE_OBJECTIF_ALAT__APOUR_LOCALISATION_LOCALISATION_OBJECTIF:
				return aPourLocalisationLocalisationObjectif != null;
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", menace: ");
		result.append(menace);
		result.append(", gdhObservation: ");
		result.append(gdhObservation);
		result.append(", lieu: ");
		result.append(lieu);
		result.append(')');
		return result.toString();
	}

} //TypeObjectifAlatImpl
