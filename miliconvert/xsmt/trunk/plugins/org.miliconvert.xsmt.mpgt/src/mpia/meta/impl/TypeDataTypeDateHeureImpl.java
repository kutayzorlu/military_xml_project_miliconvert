/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package mpia.meta.impl;

import javax.xml.datatype.XMLGregorianCalendar;

import mpia.meta.MetaPackage;
import mpia.meta.TypeDataTypeDateHeure;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type Data Type Date Heure</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link mpia.meta.impl.TypeDataTypeDateHeureImpl#getAnnee <em>Annee</em>}</li>
 *   <li>{@link mpia.meta.impl.TypeDataTypeDateHeureImpl#getAnneeMois <em>Annee Mois</em>}</li>
 *   <li>{@link mpia.meta.impl.TypeDataTypeDateHeureImpl#getDate <em>Date</em>}</li>
 *   <li>{@link mpia.meta.impl.TypeDataTypeDateHeureImpl#getHeure <em>Heure</em>}</li>
 *   <li>{@link mpia.meta.impl.TypeDataTypeDateHeureImpl#getDateHeure <em>Date Heure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeDataTypeDateHeureImpl extends EObjectImpl implements TypeDataTypeDateHeure {
	/**
	 * The default value of the '{@link #getAnnee() <em>Annee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnee()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ANNEE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnnee() <em>Annee</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnee()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar annee = ANNEE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAnneeMois() <em>Annee Mois</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnneeMois()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar ANNEE_MOIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAnneeMois() <em>Annee Mois</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnneeMois()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar anneeMois = ANNEE_MOIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getHeure() <em>Heure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeure()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar HEURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHeure() <em>Heure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeure()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar heure = HEURE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDateHeure() <em>Date Heure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateHeure()
	 * @generated
	 * @ordered
	 */
	protected static final XMLGregorianCalendar DATE_HEURE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDateHeure() <em>Date Heure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateHeure()
	 * @generated
	 * @ordered
	 */
	protected XMLGregorianCalendar dateHeure = DATE_HEURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeDataTypeDateHeureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetaPackage.Literals.TYPE_DATA_TYPE_DATE_HEURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getAnnee() {
		return annee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnnee(XMLGregorianCalendar newAnnee) {
		XMLGregorianCalendar oldAnnee = annee;
		annee = newAnnee;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.TYPE_DATA_TYPE_DATE_HEURE__ANNEE, oldAnnee, annee));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getAnneeMois() {
		return anneeMois;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAnneeMois(XMLGregorianCalendar newAnneeMois) {
		XMLGregorianCalendar oldAnneeMois = anneeMois;
		anneeMois = newAnneeMois;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.TYPE_DATA_TYPE_DATE_HEURE__ANNEE_MOIS, oldAnneeMois, anneeMois));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(XMLGregorianCalendar newDate) {
		XMLGregorianCalendar oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.TYPE_DATA_TYPE_DATE_HEURE__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getHeure() {
		return heure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeure(XMLGregorianCalendar newHeure) {
		XMLGregorianCalendar oldHeure = heure;
		heure = newHeure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.TYPE_DATA_TYPE_DATE_HEURE__HEURE, oldHeure, heure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLGregorianCalendar getDateHeure() {
		return dateHeure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateHeure(XMLGregorianCalendar newDateHeure) {
		XMLGregorianCalendar oldDateHeure = dateHeure;
		dateHeure = newDateHeure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetaPackage.TYPE_DATA_TYPE_DATE_HEURE__DATE_HEURE, oldDateHeure, dateHeure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MetaPackage.TYPE_DATA_TYPE_DATE_HEURE__ANNEE:
				return getAnnee();
			case MetaPackage.TYPE_DATA_TYPE_DATE_HEURE__ANNEE_MOIS:
				return getAnneeMois();
			case MetaPackage.TYPE_DATA_TYPE_DATE_HEURE__DATE:
				return getDate();
			case MetaPackage.TYPE_DATA_TYPE_DATE_HEURE__HEURE:
				return getHeure();
			case MetaPackage.TYPE_DATA_TYPE_DATE_HEURE__DATE_HEURE:
				return getDateHeure();
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
			case MetaPackage.TYPE_DATA_TYPE_DATE_HEURE__ANNEE:
				setAnnee((XMLGregorianCalendar)newValue);
				return;
			case MetaPackage.TYPE_DATA_TYPE_DATE_HEURE__ANNEE_MOIS:
				setAnneeMois((XMLGregorianCalendar)newValue);
				return;
			case MetaPackage.TYPE_DATA_TYPE_DATE_HEURE__DATE:
				setDate((XMLGregorianCalendar)newValue);
				return;
			case MetaPackage.TYPE_DATA_TYPE_DATE_HEURE__HEURE:
				setHeure((XMLGregorianCalendar)newValue);
				return;
			case MetaPackage.TYPE_DATA_TYPE_DATE_HEURE__DATE_HEURE:
				setDateHeure((XMLGregorianCalendar)newValue);
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
			case MetaPackage.TYPE_DATA_TYPE_DATE_HEURE__ANNEE:
				setAnnee(ANNEE_EDEFAULT);
				return;
			case MetaPackage.TYPE_DATA_TYPE_DATE_HEURE__ANNEE_MOIS:
				setAnneeMois(ANNEE_MOIS_EDEFAULT);
				return;
			case MetaPackage.TYPE_DATA_TYPE_DATE_HEURE__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case MetaPackage.TYPE_DATA_TYPE_DATE_HEURE__HEURE:
				setHeure(HEURE_EDEFAULT);
				return;
			case MetaPackage.TYPE_DATA_TYPE_DATE_HEURE__DATE_HEURE:
				setDateHeure(DATE_HEURE_EDEFAULT);
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
			case MetaPackage.TYPE_DATA_TYPE_DATE_HEURE__ANNEE:
				return ANNEE_EDEFAULT == null ? annee != null : !ANNEE_EDEFAULT.equals(annee);
			case MetaPackage.TYPE_DATA_TYPE_DATE_HEURE__ANNEE_MOIS:
				return ANNEE_MOIS_EDEFAULT == null ? anneeMois != null : !ANNEE_MOIS_EDEFAULT.equals(anneeMois);
			case MetaPackage.TYPE_DATA_TYPE_DATE_HEURE__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case MetaPackage.TYPE_DATA_TYPE_DATE_HEURE__HEURE:
				return HEURE_EDEFAULT == null ? heure != null : !HEURE_EDEFAULT.equals(heure);
			case MetaPackage.TYPE_DATA_TYPE_DATE_HEURE__DATE_HEURE:
				return DATE_HEURE_EDEFAULT == null ? dateHeure != null : !DATE_HEURE_EDEFAULT.equals(dateHeure);
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
		result.append(" (annee: ");
		result.append(annee);
		result.append(", anneeMois: ");
		result.append(anneeMois);
		result.append(", date: ");
		result.append(date);
		result.append(", heure: ");
		result.append(heure);
		result.append(", dateHeure: ");
		result.append(dateHeure);
		result.append(')');
		return result.toString();
	}

} //TypeDataTypeDateHeureImpl
